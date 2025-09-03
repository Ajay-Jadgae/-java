class CarRunner{
public static void main (String [] args){

  Car nonArg =new Car();
  
  Car singleArg =new Car("BMW");
  
  Car doubleArg =new Car("BMW",50000000);
  
  Car tripleArg =new Car("BMW",50000000,8486969l);
  
  Car quadraArg =new Car("BMW",50000000,8486969l,9.56f);
  
  Car pentaArg =new Car("BMW",50000000,8486969l,9.56f,10.10);
  
  Car hexaArg =new Car("BMW",50000000,8486969l,9.56f,10.10,true);
  
  Car heptaArg =new Car("BMW",50000000,8486969l,9.56f,10.10,true,'A');
  
}  
}