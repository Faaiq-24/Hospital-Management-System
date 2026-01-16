public class Hospital {
    private Doctor[] doctors;
    private int DocCount;

    private Patient[] patients;
    private int PCount;


    public Hospital(){
        doctors = new Doctor[100];
        DocCount = 0;

        this.patients = new Patient[100];
        this.PCount = 0;


    }
    public void addDoctor(Doctor d1)
    {
        if(this.DocCount<doctors.length)
        {
            doctors[DocCount] = d1;
            DocCount++;
        }else
        {
            System.out.println("Cannot Add more doctors. Hospital is full");
        }

    }
    public void addPatient(Patient P1)
    {
        if(this.PCount<patients.length)
        {
            patients[PCount] = P1;
            PCount++;
        }else
        {
            System.out.println("Cannot Add more Patients. Hospital is full");
        }

    }

    public void DisplayDoctors()
    {
        for(int i = 0; i<DocCount;i++)
        {
            System.out.println("Doctor Name: " + doctors[i].getDrName()+
                                "\nDoctor id: "+doctors[i].getDrId()+
                                "\nDoctor Specialty: " + doctors[i].getSpecialty());

            System.out.println("--------------");
        }

    }
    public void DisplayPatients()
    {
        for(int i = 0; i<PCount;i++)
        {
            System.out.println("Patient Name: " + patients[i].getPname()+
                    "\nPatient id: "+patients[i].getPid()+
                    "\nPatient Age: " + patients[i].getAge());
            System.out.println("--------------");
        }

    }
}
