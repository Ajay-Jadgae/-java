class DetailsRunner{
  public static void main (String [] args){
  
  Details details =new Details();
  
  System.out.println("These are the static variables");
  System.out.println(Details.name);
  System.out.println(Details.num);
  System.out.println(Details.phoneNumber);
  System.out.println(Details.CGPA);
  System.out.println(Details.percentage);
  System.out.println(Details.isPassed);

  System.out.println("Thes are static methodes");
  
  Details.name();
  Details.num();
  Details.phoneNumber();
  Details.CGPA();
  Details.percentage();
  Details.isPassed();
  
  }

}