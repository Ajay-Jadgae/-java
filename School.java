class School {
    
    public static void classroom() {
        System.out.println("The classroom is in the school");
    }
    
    public static void teacher() {
        classroom(); 
        System.out.println("The teacher is in the classroom");
    }
    
    public static void student() {
        teacher();
        System.out.println("The student is learning from the teacher");
    }
    
}
