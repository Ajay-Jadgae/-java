class Car{
	
 public Car(){
     System.out.println("This is the non argumental constructore");
  }
 public Car(String name){
	 System.out.println("name="+name);
  } 
 public Car(String name,int price){
	 System.out.println("price="+price); 
  }
 public Car(String name,int price,long carNumber){
	 System.out.println("carNumber="+carNumber);
  }
 public Car(String name,int price,long carNumber,float size ){
	 System.out.println("size="+size);
  }
 public Car(String name,int price,long carNumber,float size,double rating){
	 System.out.println("rating="+rating);
  }
 public Car(String name,int price,long carNumber,float size,double rating,boolean isBlackColor){
	 System.out.println("isBlackColor="+isBlackColor);
  }
 public Car(String name,int price,long carNumber,float size,double rating,boolean isBlackColor,char grade){
	  System.out.println("grade="+grade);
  }
  
 }
 