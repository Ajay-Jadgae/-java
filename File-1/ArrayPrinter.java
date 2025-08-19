class ArrayPrinter{
  public static void studentprint(int [] Number){
     for (int num=0;num<Number.length;num++){
   System.out.println("Number="+Number[num]);
   }
 }
 public static void printMobileNumbers(long [] mobiles){
	 for (int Num=0;Num<mobiles.length;Num++){
		 System.out.println("mobiles="+mobiles[Num]);
	 }
	 
 }
 public static void printHeights(float [] heights){
	 for (int print=0;print<heights.length;print++){
		 System.out.println("heights="+heights[print]);
	 }
 } 
 public static void printMarks(double [] marks){
	 for (int result=0;result<marks.length;result++){
		 System.out.println("marks="+marks[result]);
	 }
 }
 public static void Attendance(boolean [] present){
	 for (int attend=0;attend<present.length;attend++){
		 System.out.println("Present Today = " + present[attend]);
        }
	 }
	public static void printGrades(char[] grades) {
        for (int Grade = 0; Grade < grades.length; Grade++) {
            System.out.println("Grade = " + grades[Grade]);
        }
    } 
	
	public static void main(String[] args) {
        int[] Number = {101, 102, 103, 104, 105};
        studentprint(Number);
		
		long[] mobiles = {9876543210L, 8765432109L, 7654321098L, 6543210987L, 5432109876L};
        printMobileNumbers(mobiles);
		
		
        float[] heights = {5.1f, 5.5f, 6.0f, 5.7f, 5.9f};
        printHeights(heights);
		
		double[] marks = {88.5, 76.3, 90.2, 69.9, 95.0};
        printMarks(marks);
		
		boolean[] present = {true, true, false, true, false};
        Attendance(present);

        char[] grades = {'A', 'B', 'C', 'D', 'E'};
        printGrades(grades);

 }
}















