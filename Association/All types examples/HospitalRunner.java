class HospitalRunner {
    public static void main(String[] args) {
        Doctor icuDoctor = new Doctor(10);
        Doctor opdDoctor = new Doctor(5);
        Doctor wardDoctor = new Doctor(3);

        Nurse icuNurse = new Nurse(20);
        Nurse opdNurse = new Nurse(8);
        Nurse wardNurse = new Nurse(12);

        Bed icuBeds = new Bed(15);
        Bed opdBeds = new Bed(5);
        Bed wardBeds = new Bed(50);

        ICU icu = new ICU("ICU", icuDoctor, icuNurse, icuBeds);
        OPD opd = new OPD("OPD", opdDoctor, opdNurse, opdBeds);
        GeneralWard ward = new GeneralWard("General Ward", wardDoctor, wardNurse, wardBeds);

        icu.displayICUInfo();
        opd.displayOPDInfo();
        ward.displayWardInfo();
    }
}