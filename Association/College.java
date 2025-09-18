class College {
    String collegeName;
    String location;

  public College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }

 public void displayCollege() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
    }
}

