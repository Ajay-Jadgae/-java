class ActionMovie {
    public String title;
    public int budget;
    public CommonActor actor;

    public ActionMovie(String title, int budget, CommonActor actor) {
        this.title = title;
        this.budget = budget;
        this.actor = actor;
    }

    public void displayActionMovie() {
        System.out.println("This is ActionMovie class");
        System.out.println("Title = " + title);
        System.out.println("Budget = " + budget + " Crores");
        System.out.println("Actor Name = " + actor.name);
        System.out.println("Actor Age = " + actor.age);
    }
}
