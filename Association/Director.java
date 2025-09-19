class Director {
    public String directorName;
    public int experience;

    public Director(String directorName, int experience) {
        this.directorName = directorName;
        this.experience = experience;
    }

    public void displayDirector() {
        System.out.println("Director = " + directorName);
        System.out.println("Experience = " + experience + " years");
    }
}
