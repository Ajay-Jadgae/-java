class ClubRunner {
public static void main(String[] args) {

        int registration = Club.registrationFee();
        System.out.println("Registration Fee = " + registration);

        int trainer = Club.personalTrainer();
        System.out.println("Personal Trainer Fee = " + trainer);

        int shake = Club.proteinShake();
        System.out.println("Protein Shake Cost = " + shake);

        int locker = Club.lockerRent();
        System.out.println("Locker Rent = " + locker);

        int steam = Club.steamRoom();
        System.out.println("Steam Room Charges = " + steam);
    }

}
    