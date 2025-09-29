class VaniRunner{
	
	public static void main(String[]args){
		
		Vani vani = new Vani();
		
		vani.displayDetails(1);
		vani.displayDetails(1,"Vani");
		vani.displayDetails(1,"Vani",123456789L);
		vani.displayDetails(1,"Vani",123456789L,99.99);
		vani.displayDetails(1,"Vani",123456789L,99.99,98.98f);
		vani.displayDetails(1,"Vani",123456789L,99.99,98.98f,'a');
		vani.displayDetails(1,"Vani",123456789L,99.99,98.98f,'a',true);
		
	}
	
}