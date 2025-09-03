class PersonRunner {
    public static void main(String[] args) {
        
        Person person1 = new Person();
		
        Person person2 = new Person("Rahul");
		
        Person person3 = new Person("Rahul", 25);
		
        Person person4 = new Person("Rahul", 25, 175.5);
		
        Person person5 = new Person("Rahul", 25, 175.5,false);
		
        Person person6 = new Person("Rahul", 25, 175.5,false, 4.6f);
		
        Person person7 = new Person("Rahul", 25, 175.5,false, 4.6f, 'A');
    }
}
