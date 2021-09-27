import com.opencsv.bean.CsvBindByName;

import com.opencsv.bean.CsvBindByName;
//Create a MyUSer Class
public class MyUser {
    private String name;
    private String roll_num;
    private String department;
    private String result;
    private String cgpa;

    public MyUser(String name, String roll_num, String department, String result, String cgpa) {
        this.name = name;
        this.roll_num = roll_num;
        this.department = department;
        this.result = result;
        this.cgpa = cgpa;
    }
/*

    public String getName() {
        return name;
    }

    public String getRoll_num() {
        return roll_num;
    }

    public String getDepartment() {
        return department;
    }

    public String getResult() {
        return result;
    }

    public String getCgpa() {
        return cgpa;
    }
*/

    @Override
    //To String Method
    public String toString() {
        return "MyUser[ " +
                "name " + name + " " +
                "roll_No." + roll_num + " " +
                "department" + department + " " +
                "result" + result + " " +
                "cgpa" + cgpa + " ]";
    }
}
