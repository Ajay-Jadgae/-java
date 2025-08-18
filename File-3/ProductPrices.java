class ProductPrices {
    public static void main(String[] args) {

        double penPrice = 10.5;
        double notebookPrice = 25.0;
        double bagPrice = 799.99;
        double bottlePrice = 99.5;
        double shoesPrice = 1299.0;
        double tShirtPrice = 499.25;
        double jeansPrice = 999.75;
        double capPrice = 149.99;

        double[] prices = {
            penPrice, notebookPrice, bagPrice, bottlePrice,
            shoesPrice, tShirtPrice, jeansPrice, capPrice
        };

        for (int priceIndex = 0; priceIndex < prices.length; priceIndex++) {
            double productPrice = prices[priceIndex];
            System.out.println("Product Price=" + productPrice);
        }
    }
}
