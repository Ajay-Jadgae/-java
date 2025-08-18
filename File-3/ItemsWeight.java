class ItemsWeight {
    public static void main(String[] args) {

        byte butterWeight = 25;
        byte cheeseWeight = 30;
        byte curdCupWeight = 45;
        byte chocolateBarWeight = 20;
        byte tomatoBoxWeight = 55;
        byte spinachPacketWeight = 15;
        byte applePackWeight = 35;
        byte juiceBoxWeight = 40;

        byte[] itemWeights = {
            butterWeight, cheeseWeight, curdCupWeight, chocolateBarWeight,
            tomatoBoxWeight, spinachPacketWeight, applePackWeight, juiceBoxWeight
        };

        for (int itemIndex = 0; itemIndex < itemWeights.length; itemIndex++) {
            byte weight = itemWeights[itemIndex];
            System.out.println(weight);
        }
    }
}
