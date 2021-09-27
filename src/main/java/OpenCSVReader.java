import com.opencsv.CSVReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

//Class OpenCSVReader
public class OpenCSVReader {
    //Static Variable to provide file Path
    private static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\Sajan\\Desktop\\Annotations\\src\\main\\java\\abc.csv";

    @SuppressWarnings("resources")
    //Driver Main CLass
    public static void main(String[] args) throws Exception {
        try {
            //Create an Object
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            //Create an CSVReader Object
            CSVReader csvReader = new CSVReader(reader);
            //Reading Records One by One in a String Array
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("Name: " + nextRecord[0]);
                System.out.println("Roll no.: " + nextRecord[1]);
                System.out.println("Department: " + nextRecord[2]);
                System.out.println("Result: " + nextRecord[3]);
                System.out.println("CGPA: " + nextRecord[4]);
                System.out.println("--------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Reading All Records at once into a List<String[]>
        System.out.println("Reading All Records at once");
        try {
            //Create an Object
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            //Create an CSVReader Object
            CSVReader csvReader = new CSVReader(reader);
            //Create a List to read All Records
            List<String[]> records = csvReader.readAll();
            System.out.println("[name roll_No. department result cgpa]");
            //Make use of For Each loop
            for (String[] record : records) {
                System.out.println(Arrays.toString(record));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}