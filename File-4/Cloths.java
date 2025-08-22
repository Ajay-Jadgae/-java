class Cloths {

    public static int clothsPrice(String type, int price) {

        int finalPrice = 0;

        if (type==("shirt") && price < 1200) {
            finalPrice = 1100;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("pant") && price < 2500) {
            finalPrice = 2400;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("tShirt") && price < 800) {
            finalPrice = 750;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("jeans") && price < 2000) {
            finalPrice = 1800;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("formalShirt") && price < 1500) {
            finalPrice = 1400;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("formalPants") && price < 2800) {
            finalPrice = 2600;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("casualShirt") && price < 1600) {
            finalPrice = 1500;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("casualPant") && price < 2800) {
            finalPrice = 2700;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("suit") && price < 4000) {
            finalPrice = 3800;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("dhoti") && price < 200) {
            finalPrice = 150;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("western") && price < 5000) {
            finalPrice = 4800;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("southern") && price < 6000) {
            finalPrice = 5800;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("blazer") && price < 5500) {
            finalPrice = 5300;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("shorts") && price < 600) {
            finalPrice = 550;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else if (type==("kurta") && price < 12000) {
            finalPrice = 11500;
            System.out.println("We have what you require at a price of :" + finalPrice);
        } else {
            System.out.println("Sorry we don't have what you want.");
        }
        return finalPrice;
    }

}
