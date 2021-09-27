import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.Arrays;

//Class OpenCSVReader
public class OpenCSVReader {
    //Static Variable to provide file Path
    private static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\Sajan\\Desktop\\Annotations\\src\\main\\java\\abc.csv";

    @SuppressWarnings("resources")
    //Driver Main CLass
    public static void main(String[] args) throws Exception {
        //Create an Object
        FileReader myFile = new FileReader(SAMPLE_CSV_FILE_PATH);
        //Create a CSVReader Object
        CSVReader reader = new CSVReader(myFile);
        //Read CSV line by line and use the string array as you want
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                //Verifying the read data here
                System.out.println(Arrays.toString(nextLine));
            }
        }
    }
}