import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
    private String AppId;
    private String pname;
    private String Dname;
    private LocalDateTime Appdt;

    public Appointment(String id,String name,String named,LocalDateTime time)
    {
        this.AppId = id;
        this.pname = name;
        this.Dname = named;
        this.Appdt = time;
    }
    //getters
    public String getAppId()
    {
        return this.AppId;
    }
    public String getPname()
    {
        return this.pname;
    }
    public String getDname()
    {
        return this.Dname;
    }
    public LocalDateTime getAppdt()
    {
        return this.Appdt;
    }
    public void ShowAppDetails()
    {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm");
        System.out.println("Appointment ID: "+ this.AppId +
                            "\nPatient Name: " + this.pname+
                            "\nDoctor Name: "+this.Dname+
                            "\nAppointmeint time: "+ this.Appdt.format(format));
        System.out.println("--------------");
    }
}
