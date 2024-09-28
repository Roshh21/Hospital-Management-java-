import java.util.ArrayList;
public class DoctorManager {
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public void addDoctor(int id, String name, String specialty) {
        Doctor newDoctor = new Doctor(id, name, specialty);
        doctors.add(newDoctor);
        System.out.println("Doctor added successfully.");
    }

    public void viewDoctors() {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    public Doctor getDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }
}

