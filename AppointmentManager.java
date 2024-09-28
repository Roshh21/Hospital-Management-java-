import java.util.ArrayList;

public class AppointmentManager {
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void scheduleAppointment(int appointmentId, int patientId, int doctorId) {
        Appointment newAppointment = new Appointment(appointmentId, patientId, doctorId);
        appointments.add(newAppointment);
        System.out.println("Appointment scheduled successfully.");
    }

    public void viewAppointments() {
        System.out.println("List of Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }
}
