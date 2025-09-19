class DramaMovie {
    public String title;
    public int budget;
    public CommonActor actor;

    public DramaMovie(String title, int budget, CommonActor actor) {
        this.title = title;
        this.budget = budget;
        this.actor = actor;
    }

    public void displayDramaMovie() {
        System.out.println("This is DramaMovie class");
        System.out.println("Title = " + title);
        System.out.println("Budget = " + budget + " Crores");
        System.out.println("Actor Name = " + actor.name);
        System.out.println("Actor Age = " + actor.age);
    }
}
