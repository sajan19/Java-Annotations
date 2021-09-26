import java.lang.annotation.*;
import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface MethodInfo {
    String author() default "Sajan";
    String date();
    int revision() default 1;
    String comments();
}
public class AnnotationExample {
    @Override
    @MethodInfo(author = "Sajan", comments = "Main method", date = "Sep 25 2021", revision = 1)
    public String toString(){
       return "Overridden toString method";
    }
    @Deprecated
    @MethodInfo(comments = "deprecated method", date = "Sep 26 2021")
    public static void oldMethod(){
        System.out.println("old method, don't use it.");
    }

    public static void main(String[] args) {
        try {
            for (Method method : AnnotationExample.class.getMethods()){
                //check if MethodInfo annotations is present for the method
                if (method.isAnnotationPresent(MethodInfo.class)){
                    try {
                        //iterates all the annotations available in the method
                        for (Annotation anno : method.getDeclaredAnnotations()){
                            System.out.println("Annotations in Method "+method+" : "+anno);
                        }
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        if (methodAnno.revision() == 1){
                            System.out.println("Method with revision no. 1 = "+method);
                        }
                    }catch (Throwable ex){
                        ex.printStackTrace();
                    }
                }
            }
        }catch (SecurityException e){
            e.printStackTrace();
        }
    }
}
