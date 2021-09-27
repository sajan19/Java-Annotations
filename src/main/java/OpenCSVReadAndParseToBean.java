import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
/* POJO(Plain Old Java Object class for
   reading CSV Directly
*/
public class OpenCSVReadAndParseToBean {
    //Static Variable to provide file Path
    private static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\Sajan\\Desktop\\Annotations\\src\\main\\java\\abc.csv";
    //Driver Main Method
    public static void main(String[] args) throws Exception {
        try {
            //Create an Object
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            //Create an CsvToBean Object
            CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder(reader)
                                           .withType(CSVUser.class)
                                           .withIgnoreLeadingWhiteSpace(true)
                                           .build();
            //Iterator to read each row of CSV File
            Iterator<CSVUser> csvUserIterator = csvToBean.iterator();
            while (csvUserIterator.hasNext()) {
                //Iterator Object
                CSVUser csvUser = csvUserIterator.next();
                System.out.println("Name: "+csvUser.getName());
                System.out.println("Roll_Num: "+csvUser.getRoll_num());
                System.out.println("Department: "+csvUser.getDepartment());
                System.out.println("Result: "+csvUser.getResult());
                System.out.println("CGPA: "+csvUser.getCgpa());
                System.out.println("------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Reads all CSV contents into memory (Not Suitable for large CSV files)
        try {
            //Create an Object
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            //Create an CsvToBean Object
            CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder(reader)
                                           .withType(CSVUser.class)
                                           .withIgnoreLeadingWhiteSpace(true)
                                           .build();
            List<CSVUser> csvUsers = csvToBean.parse();
            for (CSVUser csvUser : csvUsers) {
                System.out.println(csvUser);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
