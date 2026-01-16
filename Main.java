public class Main {
    public static void main(String[] args) {

    Hospital hospital = new Hospital();

    Doctor doctor1 = new Doctor("Dr Hafeez","0123","Pediatrician");
    Doctor doctor2 = new Doctor("Dr ahmed","0124","Therapist");

    Patient Patient1 = new Patient("Faaiq",20,"0001");
    Patient Patient2 = new Patient("John",28,"0002");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(Patient1);
        hospital.addPatient(Patient2);

        hospital.DisplayDoctors();
        hospital.DisplayPatients();

    }
}