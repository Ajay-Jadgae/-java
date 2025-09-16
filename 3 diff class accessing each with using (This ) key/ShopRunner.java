class ShopRunner {

    public static void main(String[] args) {
        Shop objects = new Shop();

        Mall one = new Mall(200, "black");
        Mall two = new Mall(100, "orange");
        Mall three = new Mall(50, "red");   
        Mall four = new Mall(25, "green");

        Mall[] mall = { one, two, three, four };

        objects.price(mall);
    }
}
