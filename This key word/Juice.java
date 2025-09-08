class Juice{

  public Juice(){
      this ("juice");
	  System.out.println("This is no argumental constructor");
  }
  public Juice(String juiceName){
	  this ("Apple",120);
      System.out.println("This is 1argumental constructor"); 	  
	  System.out.println("The juice name is ="+juiceName);
  }
  public Juice(String juiceName,int price){
	  this ("Apple",120,972457574l);
      System.out.println("This is 2argumental constructor"); 	  
	  System.out.println("The juice price is ="+price);	  
  }
  public Juice(String juiceName,int price,long num){
	  this ("Apple",120,972457574l,79.83);
      System.out.println("This is 3argumental constructor"); 	  
	  System.out.println("num ="+num);	  
  }
  public Juice(String juiceName,int price,long num,double ratting){
	  this ("Apple",120,972457574l,79.83,15.5f);
	  System.out.println("This is 4argumental constructor"); 	  
	  System.out.println("ratting ="+ratting);	   
  }
  public Juice(String juiceName,int price,long num,double ratting,float weight){
      this("Apple",120,972457574l,79.83,15.5f,false);
  	  System.out.println("This is 5argumental constructor"); 	  
	  System.out.println("weight ="+weight);	   
  }
  public Juice(String juiceName,int price,long num,double ratting,float weight,boolean isCold){
      this("Apple",120,972457574l,79.83,15.5f,false,'A');
  	  System.out.println("This is 6argumental constructor"); 	  
	  System.out.println("isCold ="+isCold);	   
  } 
  public Juice(String juiceName,int price,long num,double ratting,float weight,boolean isCold,char grade){
  	  System.out.println("This is 7argumental constructor"); 	  
	  System.out.println("grade ="+grade);	   
  }    
  
}