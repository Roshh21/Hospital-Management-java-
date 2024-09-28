import java.util.ArrayList;

public class PatientManager {
    private ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(int id, String name, int age, String disease) {
        Patient newPatient = new Patient(id, name, age, disease);
        patients.add(newPatient);
        System.out.println("Patient added successfully.");
    }

    public void viewPatients() {
        System.out.println("List of Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public Patient getPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }
}
