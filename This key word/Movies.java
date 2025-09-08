class Movies{
	
  public Movies(){
    this ("movies");
    System.out.println("This no Argumental constructor");
  }
  public Movies(String name){
	  this ("AAA",50);
	  System.out.println("This is single argument constructor");
	  System.out.println("Name is ="+name);
  }
  public Movies(String name,int id ){
	  this ("AAA",50,63637885788l);
	  System.out.println("This is 2 argument constructor");
      System.out.println("id is ="+id);
  }
  public Movies(String name,int id,long phoneNumber){
	  this ("AAA",50,63637885788l,89.102);
	  System.out.println("This is 3 argument constructor");
      System.out.println("phoneNumber is ="+phoneNumber);
  }
  public Movies(String name,int id,long phoneNumber,double rating){
	  this ("AAA",50,63637885788l,89.102,90.1f);
	  System.out.println("This is 4 argument constructor");
      System.out.println("rating is ="+	rating);
  }
  public Movies(String name,int id,long phoneNumber,double rating,float level){
	  this ("AAA",50,63637885788l,89.102,90.1f,true);
	  System.out.println("This is 5 argument constructor");
      System.out.println("level is ="+	level);		
  }  
  public Movies(String name,int id,long phoneNumber,double rating,float level,boolean isThisKannada){
	  this ("AAA",50,63637885788l,89.102,90.1f,true,'A');
	  System.out.println("This is 6 argument constructor");
      System.out.println("isThisKannada ="+	isThisKannada);				
  }
  public Movies(String name,int id,long phoneNumber,double rating,float level,boolean isThisKannada,char movieRating){
	  System.out.println("This is 7 argument constructor");
      System.out.println("movieRating is ="+	movieRating);				  
  }
}