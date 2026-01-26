import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Hospital hospital = new Hospital();

    Doctor doctor1 = new Doctor("Dr Hafeez",123,40,"Pediatrician");
    Doctor doctor2 = new Doctor("Dr ahmed",124, 35,"Therapist");

    Patient Patient1 = new Patient("Jawad",20,21,"Fever");
    Patient Patient2 = new Patient("John",28, 18,"Headache");

//        hospital.addDoctor(doctor1);
//        hospital.addDoctor(doctor2);
//        hospital.addPatient(Patient1);
//        hospital.addPatient(Patient2);
//
//        hospital.DisplayDoctors();
//        hospital.DisplayPatients();

        doctor1.displayinfo();

        Patient1.displayinfo();
    }
}