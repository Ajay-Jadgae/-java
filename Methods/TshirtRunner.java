class TshirtRunner{

public static void main (String [] args){

 Tshirt tshirt=new Tshirt();
 
 String brand=tshirt.brand();
 int size = tshirt.size();
 long serialNumber=tshirt.serialNumber();
 double price= tshirt.price();
 float Discount=tshirt.Discount();
 boolean isAvailable=tshirt.isAvailable();
 tshirt.quality();
}
}