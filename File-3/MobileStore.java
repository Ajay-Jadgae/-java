class MobileStore {
    public static void main(String[] args) {

        String[] mobileBrands = {"Samsung", "Apple", "OnePlus", "Realme"};
        int[] prices = {15000, 80000, 40000, 12000};
        char[] ratings = {'A', 'A', 'B', 'C'};
        double[] screenSizes = {6.5, 6.1, 6.7, 6.4};
        boolean[] isAvailable = {true, false, true, true};
		
		System.out.println("mobileBrands="+mobileBrands.length);
		System.out.println("prices="+prices.length);
		System.out.println("ratings="+ratings.length);
		System.out.println("screenSizes="+screenSizes.length);
		System.out.println("isAvailable="+isAvailable.length);
	}
}