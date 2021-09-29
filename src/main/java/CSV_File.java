import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

//public class CSV_File {
//    public static void main(String[] args) throws IOException {
/*        //Read CSV file line by line
        String csv = "data.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] record = "3,David,Feezor,USA,40".split(",");
//        String [] record2 = "4,Warner,Tokyo,London,67".split(",");
        writer.writeNext(record);
        writer.close();*/

/*
        //Create a new file
        String filePath = "C:\\Users\\Sajan\\Desktop\\Annotations\\src\\main\\resources\\network.csv";
//        File newFile = new File("network.csv");
        File newFile = new File(filePath);
        try {
            newFile.createNewFile();
            System.out.println("File has being created...");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error! No file was created...");
        }
        //Use writer to Add data to your CSV File
        CSVWriter writer = new CSVWriter(new FileWriter(filePath, true));
        String [] record = "3,David,Feezor,USA,40".split(",");
        writer.writeNext(record);
        System.out.println("Data has being added in CSV file...");
        writer.close();
*/
public class CSV_File {
//    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        try {
            //Declare the file Path
            String filePath ="C:\\Users\\Sajan\\Desktop\\Annotations\\src\\main\\resources\\hello.csv";
            CSVReader reader = new CSVReader(new FileReader(filePath));
//            CSVWriter writer = new CSVWriter(new FileWriter(filePath,true));
//            String [] record = "3,David,Feezor,USA,40".split(",");
//            String [] record = "3,David,Feezor,USA,40".split(",");
//            writer.writeNext(record);
//            System.out.println("Data has being added in CSV file...");
//            writer.close();
            //Read CSV line by line and use the string array as you want
           /* String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine != null) {
                    //Verifying the read data here
                    System.out.println(Arrays.toString(nextLine));
                }
            }*/
            //Read all rows at once
            System.out.println("Read All Rows at Once..");
            List<String[]> allRows = reader.readAll();
            //Read CSV line by line and use the string array as you want
            for(String[] row : allRows) {
                System.out.println(Arrays.toString(row));
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error! Unable to find file...");
        }
    }
}

