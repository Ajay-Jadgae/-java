class CricketRunner {

    public static void main(String[] args) {

        int ticket = Cricket.matchTicket();
        System.out.println("Match Ticket Price = " + ticket);

        int bat = Cricket.batCost();
        System.out.println("Bat Cost = " + bat);

        int ball = Cricket.ballCost();
        System.out.println("Ball Cost = " + ball);

        int jersey = Cricket.jerseyCost();
        System.out.println("Jersey Cost = " + jersey);

        int practice = Cricket.netPracticeFee();
        System.out.println("Net Practice Fee = " + practice);
    }

}
