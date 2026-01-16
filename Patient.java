public class Patient {
    private String Pname;
    private int age;
    private String Pid;


    public Patient(String namep,int age,String id)
    {
        this.Pname = namep;
        this.age = age;
        this.Pid = id;

    }

    //getters
    public String getPname()
    {

        return this.Pname;
    }
    public int getAge()
    {

        return this.age;
    }
    public String getPid()
    {

        return this.Pid;
    }
}
