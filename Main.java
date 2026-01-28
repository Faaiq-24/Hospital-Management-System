import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        int dCount = 0;

        // ===== Doctor Count Validation =====
        while (true) {
            try {
                System.out.print("How many doctors do you want to add? ");
                dCount = sc.nextInt();

                if (dCount <= 0) {
                    System.out.println("❌ Number of doctors must be greater than 0.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Please enter a valid number.");
                sc.next(); // clear wrong input
            }
        }
        sc.nextLine(); // consume newline

        // ===== Add Doctors =====
        for (int i = 0; i < dCount; i++) {
            System.out.println("\nEnter details for Doctor " + (i + 1));

            System.out.print("Doctor Name: ");
            String name = sc.nextLine();

            int id;
            while (true) {
                try {
                    System.out.print("Doctor ID: ");
                    id = sc.nextInt();
                    if (id <= 0) {
                        System.out.println("❌ ID must be positive.");
                    } else break;
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid ID. Enter a number.");
                    sc.next();
                }
            }

            int age;
            while (true) {
                try {
                    System.out.print("Doctor Age: ");
                    age = sc.nextInt();
                    if (age <= 0) {
                        System.out.println("❌ Age must be greater than 0.");
                    } else break;
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid age. Enter a number.");
                    sc.next();
                }
            }

            sc.nextLine(); // consume newline
            System.out.print("Specialty: ");
            String specialty = sc.nextLine();

            Doctor d = new Doctor(name, id, age, specialty);
            hospital.addDoctor(d);
        }

        // ===== Patient Count Validation =====
        int pCount = 0;
        while (true) {
            try {
                System.out.print("\nHow many patients do you want to add? ");
                pCount = sc.nextInt();

                if (pCount <= 0) {
                    System.out.println("❌ Number of patients must be greater than 0.");
                } else break;
            } catch (InputMismatchException e) {
                System.out.println("❌ Please enter a valid number.");
                sc.next();
            }
        }
        sc.nextLine();

        // ===== Add Patients =====
        for (int i = 0; i < pCount; i++) {
            System.out.println("\nEnter details for Patient " + (i + 1));

            System.out.print("Patient Name: ");
            String name = sc.nextLine();

            int age;
            while (true) {
                try {
                    System.out.print("Patient Age: ");
                    age = sc.nextInt();
                    if (age <= 0) {
                        System.out.println("❌ Age must be greater than 0.");
                    } else break;
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid age. Enter a number.");
                    sc.next();
                }
            }

            int id;
            while (true) {
                try {
                    System.out.print("Patient ID: ");
                    id = sc.nextInt();
                    if (id <= 0) {
                        System.out.println("❌ ID must be positive.");
                    } else break;
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid ID. Enter a number.");
                    sc.next();
                }
            }

            sc.nextLine();
            System.out.print("Enter Patient Illness: ");
            String illness = sc.nextLine();

            Patient p = new Patient(name, age, id, illness);
            hospital.addPatient(p);
        }

        // ===== Display Data =====
        hospital.DisplayDoctors();
        hospital.DisplayPatients();
        Doctor d1 = new Doctor("Dr john" ,1234,40,"Pediatrician" );
        d1.displayinfo();
        Patient p1 = new Patient("Yahya",4321,10,"Fever");
        p1.displayinfo();
    }
}
