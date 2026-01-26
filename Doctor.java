public class Doctor extends Person{
    private String Specialty;

    public Doctor(String name, int id, int age, String specialty) {
        super(name, id, age);
        Specialty = specialty;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Specialty: " + Specialty);
        System.out.println("--------------");
    }

    public String getSpecialty()
    {
        return this.Specialty;
    }
}
