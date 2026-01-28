import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Hospital hospital = new Hospital();

        System.out.print("How many doctors do you want to add? ");
        int dCount = sc.nextInt();
        sc.nextLine(); // consume newline

        for(int i = 0; i < dCount; i++) {
            System.out.println("\nEnter details for Doctor " + (i + 1));

            System.out.print("Doctor Name: ");
            String name = sc.nextLine();

            System.out.print("Doctor ID: ");
            int id = sc.nextInt();

            System.out.println("Doctor Age: ");
            int age = sc.nextInt();

            sc.nextLine();
            System.out.print("Specialty: ");
            String specialty = sc.nextLine();


            Doctor d = new Doctor(name, id, age ,specialty);
            hospital.addDoctor(d);

        }


        System.out.print("\nHow many patients do you want to add? ");
        int pCount = sc.nextInt();
        sc.nextLine(); // consume newline

        for(int i = 0; i < pCount; i++) {
            System.out.println("\nEnter details for Patient " + (i + 1));

            System.out.print("Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Patient Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Patient Illness: ");
            String illness = sc.nextLine();

            Patient p = new Patient(name, age, id,illness);
            hospital.addPatient(p);
        }


        hospital.DisplayDoctors();
        hospital.DisplayPatients();

        Doctor d1 = new Doctor("Dr john" ,1234,40,"Pediatrician" );
        d1.displayinfo();
        Patient p1 = new Patient("Yahya",4321,10,"Fever");
        p1.displayinfo();





    }
}