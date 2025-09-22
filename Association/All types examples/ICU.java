class ICU {
    public String name;
    public Doctor doctor;
    public Nurse nurse;
    public Bed bed;

    public ICU(String name, Doctor doctor, Nurse nurse, Bed bed) {
        this.name = name;
        this.doctor = doctor;
        this.nurse = nurse;
        this.bed = bed;
    }

    public void displayICUInfo() {
        System.out.println("Hospital Section: " + name);
        System.out.println("Doctors = " + doctor.numberOfDoctors);
        System.out.println("Nurses = " + nurse.numberOfNurses);
        System.out.println("Beds = " + bed.numberOfBeds);
    }
}