class MovieRunner {
    public static void main(String[] args) {
        CommonActor hero1 = new CommonActor("Shahrukh Khan", 55);
        CommonActor hero2 = new CommonActor("Akshay Kumar", 50);
        CommonActor hero3 = new CommonActor("Ranbir Kapoor", 40);

        ActionMovie action = new ActionMovie("Pathaan", 250, hero1);
        ComedyMovie comedy = new ComedyMovie("Hera Pheri 3", 120, hero2);
        DramaMovie drama = new DramaMovie("Rockstar 2", 180, hero3);

        Director director = new Director("Rajkumar Hirani", 20);
        Producer producer = new Producer("Karan Johar", "Dharma Productions");

        action.displayActionMovie();
        comedy.displayComedyMovie();
        drama.displayDramaMovie();
        director.displayDirector();
        producer.displayProducer();
    }
}
