class CustomerPhoneNumber{
    public static void main(String[] args) {

        long jhon = 9876543210L;
        long ravindra = 9123456780L;
        long rahul = 9988776655L;
        long raju = 9090909090L;
        long jadge = 8000000001L;
        long kiran = 7666777788L;
        long prakash = 7000123456L;
        long krishana = 8899776655L;

        long[] mobiles = {
            jhon, ravindra, rahul, raju,
            jadge, kiran, prakash, krishana
        };

        for (int customerIndex = 0; customerIndex < mobiles.length; customerIndex++) {
            
            System.out.println(mobiles[customerIndex]);
        }
    }
}
