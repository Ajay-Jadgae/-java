class OnlineCourses {
    public static void main(String[] args) {

        String[] courseNames = {"Java Programming", "Web Development", "Data Science", "Cyber Security"};
        String[] instructors = {"Mr. Kumar", "Ms. Asha", "Dr. Ravi", "Mr. Arjun"};
        char[] courseLevels = {'B', 'I', 'A', 'I'}; 
        double[] durations = {30.0, 45.5, 60.0, 40.0}; 
        boolean[] isCertificateIncluded = {true,false};
		
		System.out.println("courseNames="+courseNames.length);
		System.out.println("instructors="+instructors.length);
		System.out.println("courseLevels="+courseLevels.length);
		System.out.println("durations="+durations.length);
		System.out.println("isCertificateIncluded="+isCertificateIncluded.length);
	}
	}