class SchoolStaffRunner{
	
	public static void main(String[]args){
		
		SchoolStaff staff = new SchoolStaff("Ajay",1);
		
		School schoolClass=new School(1,"Heaven",staff);
		
		staff.staffInfo();
		schoolClass.displayInfo();
		
	}
	
}