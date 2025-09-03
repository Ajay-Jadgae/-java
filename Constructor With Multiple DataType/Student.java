class Student{

   public Student(){
      System.out.println("This is the non argumental constructore");
    }
   public Student(String name){
     System.out.println("name="+name);	
    }
   public Student(String name, int rollNumber ){
	  System.out.println("Student rollNumber="+rollNumber); 
    }
   public Student(String name,int rollNumber,long USN){
	   System.out.println("Student USN numbers="+USN);
    }
   public Student(String name, int rollNumber,long USN,float marks){
	   System.out.println("student marks="+marks);
   }
   public Student(String name,int rollNumber,long USN,float marks,double percentage){
	   System.out.println("Student percentage="+percentage);
   }
   public Student(String name,int rollNumber,long USN,float marks,double percentage,char grade){
	   System.out.println("student grade="+grade);
   }
   public Student(String name,int rollNumber,long USN,float marks,double percentage,char grade,boolean isRain){
	   System.out.println("isRain="+isRain);
   }
      
}