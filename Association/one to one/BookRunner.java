class BookRunner{
	
	public static void main(String[]args){
		
		NoteBook book = new NoteBook(200,300);
		Page page = new Page(book);
		
		page.displayDetails();
		
	}
	
}