class Employee extends Company {

	public int employeeId;
	public String employeeName;
	public long mobileNumber;
	public double salary;
	public float performanceScore;
	public char employeeGrade;
	public boolean isPermanent;

	public Employee() {
		super();
		System.out.println("This is no argumental constructor in Employee class.");
	}

	public Employee(int employeeId, String employeeName, long mobileNumber, double salary, float performanceScore, char employeeGrade, boolean isPermanent) {
		
		this();
		
		super.companyId = employeeId;
		super.companyName = employeeName;
		super.contactNumber = mobileNumber;
		super.revenue = salary;
		super.growthRate = performanceScore;
		super.grade = employeeGrade;
		super.isPublic = isPermanent;

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.mobileNumber = mobileNumber;
		this.salary = salary;
		this.performanceScore = performanceScore;
		this.employeeGrade = employeeGrade;
		this.isPermanent = isPermanent;
	}

	public void displayDetails() {
		
		System.out.println("Company class details:");
		System.out.println("Company ID = " + super.companyId);
		System.out.println("Company Name = " + super.companyName);
		System.out.println("Contact Number = " + super.contactNumber);
		System.out.println("Revenue = " + super.revenue);
		System.out.println("Growth Rate = " + super.growthRate);
		System.out.println("Grade = " + super.grade);
		System.out.println("Is Public = " + super.isPublic);
		
		System.out.println("\nEmployee class details:");
		System.out.println("Employee ID = " + this.employeeId);
		System.out.println("Employee Name = " + this.employeeName);
		System.out.println("Mobile Number = " + this.mobileNumber);
		System.out.println("Salary = " + this.salary);
		System.out.println("Performance Score = " + this.performanceScore);
		System.out.println("Employee Grade = " + this.employeeGrade);
		System.out.println("Is Permanent = " + this.isPermanent);
	}
}