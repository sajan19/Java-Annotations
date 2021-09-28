import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVWriter {
    //Static Variable to provide file Path
    private static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\Sajan\\Desktop\\Annotations\\src\\main\\resources\\sample.csv";
    //Driver Main Method
    public static void main(String[] args) throws Exception{
//        String csv = "data.csv";
//        CSVWriter writer = new CSVWriter(new FileWriter(SAMPLE_CSV_FILE_PATH));
        Writer writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE_PATH));
        StatefulBeanToCsv<MyUser> beanToCsv = new StatefulBeanToCsvBuilder(writer).withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();
        List<MyUser> myUsers = new ArrayList<>();
        myUsers.add(new MyUser("sajan","176","extc","pass","8.95"));
        myUsers.add(new MyUser("rudra","17","csc","pass","7.35"));
        myUsers.add(new MyUser("ronak","137","ec","pass","5.95"));
        myUsers.add(new MyUser("raj","114","civil","pass","9.3"));
        beanToCsv.write(myUsers);
        System.out.println("Entries have being Successfully Added in CSV file");
        //Create record
//        String [] record = "4,David,Miller,Australia,30".split(",");
//        //Write the record to file
//        writer.writeNext(record);

        //close the writer
        writer.close();
    }
}
