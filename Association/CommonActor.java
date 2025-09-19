class CommonActor {
    public String name;
    public int age;

    public CommonActor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayCommonActor() {
        System.out.println("This is CommonActor class");
        System.out.println("Actor Name = " + name);
        System.out.println("Actor Age = " + age);
    }
}
