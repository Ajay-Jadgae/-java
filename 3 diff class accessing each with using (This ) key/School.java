class School {

    public void showStaff(Staff[] staffs) {
		
        System.out.println( staffs.length);

        for (int num = 0; num < staffs.length; num++) {
            
			Staff number=staffs[num];
			
			number.displayStaff();
			
			
        }
    }
}