class ComedyMovie {
    public String title;
    public int budget;
    public CommonActor actor;

    public ComedyMovie(String title, int budget, CommonActor actor) {
        this.title = title;
        this.budget = budget;
        this.actor = actor;
    }

    public void displayComedyMovie() {
        System.out.println("This is ComedyMovie class");
        System.out.println("Title = " + title);
        System.out.println("Budget = " + budget + " Crores");
        System.out.println("Actor Name = " + actor.name);
        System.out.println("Actor Age = " + actor.age);
    }
}
