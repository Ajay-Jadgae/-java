class HospitalRunner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Meera", "Cardiologist");
        Patient patient = new Patient("Arjun", 45);
        Room room = new Room(302);

        Hospital hospital = new Hospital("City Care Hospital", doctor, patient, room);
        hospital.displayHospitalDetails();
    }
}