class Hospital {
    public String hospitalName;
    public Doctor doctor;
    public Patient patient;
    public Room room;

    public Hospital(String hospitalName, Doctor doctor, Patient patient, Room room) {
        this.hospitalName = hospitalName;
        this.doctor = doctor;
        this.patient = patient;
        this.room = room;
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Doctor: " + doctor.doctorName + " (" + doctor.specialization + ")");
        System.out.println("Patient: " + patient.patientName + " (Age: " + patient.age + ")");
        System.out.println("Room Number: " + room.roomNumber);
    }
}