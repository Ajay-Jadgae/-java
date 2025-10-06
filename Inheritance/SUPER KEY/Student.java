class Student extends College {

	public int studentId;
	public String studentName;
	public long phoneNumber;
	public double marks;
	public float attendance;
	public char section;
	public boolean hasScholarship;

	public Student() {
		super();
		System.out.println("This is no argumental constructor in Student class.");
	}

	public Student(int studentId, String studentName, long phoneNumber, double marks, float attendance, char section, boolean hasScholarship) {
		
		this();
		
		super.collegeId = studentId;
		super.collegeName = studentName;
		super.contactNumber = phoneNumber;
		super.universityRank = marks;
		super.placementRate = attendance;
		super.grade = section;
		super.isAutonomous = hasScholarship;

		this.studentId = studentId;
		this.studentName = studentName;
		this.phoneNumber = phoneNumber;
		this.marks = marks;
		this.attendance = attendance;
		this.section = section;
		this.hasScholarship = hasScholarship;
	}

	public void displayDetails() {
		
		System.out.println("College class details:");
		System.out.println("College ID = " + super.collegeId);
		System.out.println("College Name = " + super.collegeName);
		System.out.println("Contact Number = " + super.contactNumber);
		System.out.println("University Rank = " + super.universityRank);
		System.out.println("Placement Rate = " + super.placementRate);
		System.out.println("Grade = " + super.grade);
		System.out.println("Is Autonomous = " + super.isAutonomous);
		
		System.out.println("\nStudent class details:");
		System.out.println("Student ID = " + this.studentId);
		System.out.println("Student Name = " + this.studentName);
		System.out.println("Phone Number = " + this.phoneNumber);
		System.out.println("Marks = " + this.marks);
		System.out.println("Attendance = " + this.attendance);
		System.out.println("Section = " + this.section);
		System.out.println("Has Scholarship = " + this.hasScholarship);
	}
}