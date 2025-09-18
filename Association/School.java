class School{
	
	public int classNumber;
	public String className;
	public SchoolStaff schoolStaff;
	
	public School(int classNumber,String className,SchoolStaff schoolStaff){
		
		this.classNumber=classNumber;
		this.className=className;
		this.schoolStaff=schoolStaff;
		
	}
	
	public void displayInfo(){
		
		System.out.println("Class Number = "+classNumber);
		System.out.println("Class Name = "+className);
		System.out.println("Staff Name = "+schoolStaff.staffName);
		System.out.println("Number of Staff = "+schoolStaff.numberOfStaff);
		
	}
	
}