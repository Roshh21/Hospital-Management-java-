import java.util.Scanner;
public class HospitalManagementSystem {
    private static PatientManager patientManager = new PatientManager();
    private static DoctorManager doctorManager = new DoctorManager();
    private static AppointmentManager appointmentManager = new AppointmentManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    addDoctor();
                    break;
                case 3:
                    scheduleAppointment();
                    break;
                case 4:
                    patientManager.viewPatients();
                    break;
                case 5:
                    doctorManager.viewDoctors();
                    break;
                case 6:
                    appointmentManager.viewAppointments();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Methods for interacting with other modules
    public static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Patient Name: ");
        String name = scanner.next();
        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Patient Disease: ");
        String disease = scanner.next();

        patientManager.addPatient(id, name, age, disease);
    }

    public static void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Doctor Name: ");
        String name = scanner.next();
        System.out.print("Enter Doctor Specialty: ");
        String specialty = scanner.next();

        doctorManager.addDoctor(id, name, specialty);
    }

    public static void scheduleAppointment() {
        System.out.print("Enter Appointment ID: ");
        int appointmentId = scanner.nextInt();
        System.out.print("Enter Patient ID: ");
        int patientId = scanner.nextInt();
        System.out.print("Enter Doctor ID: ");
        int doctorId = scanner.nextInt();

        appointmentManager.scheduleAppointment(appointmentId, patientId, doctorId);
    }
}
