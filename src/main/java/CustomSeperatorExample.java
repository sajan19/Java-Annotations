import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class CustomSeperatorExample{
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception
    {
        //Build reader instance
        String filePath = "C:\\Users\\Sajan\\Desktop\\Annotations\\good.csv";
//        CSVReader reader = new CSVReader(new FileReader("good.csv"), ';', '"', 1);
        CSVReader reader = new CSVReader(new FileReader(filePath));
        //Read all rows at once
        List<String[]> allRows = reader.readAll();
        //Read CSV line by line and use the string array as you want
        for(String[] row : allRows){
            System.out.println(Arrays.toString(row));
        }
    }
}