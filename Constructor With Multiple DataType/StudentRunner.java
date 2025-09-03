class StudentRunner{
   public static void main(String [] args){
   
   Student nonArg =new Student();
   
   Student singleArg =new Student("ajay");
   
   Student doubleArg=new Student ("ajay",50);
   
   Student tripleArg=new Student ("ajay",50,6365464664l);
   
   Student quadraArg=new Student ("ajay",50,6365464664l,7.5f);
   
   Student pentaArg=new Student ("ajay",50,6365464664l,7.5f,80.83);
   
   Student hexaArg=new Student ("ajay",50,6365464664l,7.5f,80.83,'A');
   
   Student heptaArg=new Student ("ajay",50,6365464664l,7.5f,80.83,'A',true);

   }
  
}