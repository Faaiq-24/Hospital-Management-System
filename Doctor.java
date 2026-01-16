public class Doctor{
    private String DrName;
    private String DrId;
    private String Specialty;

    public Doctor(String drNamep,String drIdp,String Specialtyp)
    {
        this.DrName = drNamep;
        this.DrId = drIdp;
        this. Specialty = Specialtyp;
    }

    //getters
    public String getDrName()
    {

        return this.DrName;
    }
    public String getDrId()
    {

        return this.DrId;
    }
    public String getSpecialty()
    {

        return this.Specialty;
    }


}
