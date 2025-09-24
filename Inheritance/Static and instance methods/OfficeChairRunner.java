class OfficeChairRunner {
    public static void main(String[] args) {
        
        OfficeChair chair = new OfficeChair();
        
        chair.legs = 4;
        chair.material = "Wood";
        
        chair.showLegs();
        chair.showMaterial();
    }
}
