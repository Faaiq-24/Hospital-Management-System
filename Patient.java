public class Patient extends Person {
    private String illness;

    public Patient(String name, int id, int age, String illness) {
        super(name, id, age);
        this.illness = illness;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("illness: " + illness);
        System.out.println("--------------");
    }

    public String getIllness() {
        return illness;
    }
}
