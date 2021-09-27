import com.opencsv.bean.CsvBindByName;
//Create a CSVUser Class
public class CSVUser {
    @CsvBindByName
    private String name;
    @CsvBindByName
    private String roll_num;
    @CsvBindByName
    private String department;
    @CsvBindByName
    private String result;
    @CsvBindByName
    private String cgpa;

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

    @Override
    //To String Method
    public String toString() {
        return "CSVUser[ " +
                "name " + name + " " +
                "roll_No." + roll_num + " " +
                "department" + department + " " +
                "result" + result + " " +
                "cgpa" + cgpa + " ]";
    }
}
