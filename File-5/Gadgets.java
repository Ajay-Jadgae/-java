class Gadgets{

public static int gadgetsTypes(String name,int amount){
   
   int price =0;
	
   if (name=="iphone"||amount<10000){
	   price =5000;
	   System.out.println("iphone price is="+price);
	   return price;
   }else if(name=="sumsungGalaxy"||amount<60000){
	   price = 45000;
	   System.out.println("sumsungGalaxy price is="+price);
	   return price;
   }
   
 if (name=="appleWatch"||amount<2500){
	 price =31000;
	 System.out.println("The apple watch price is ="+price);
	 return price;
 }else if(name=="fitbit"||amount<3000){
	 price=500;
	 System.out.println("the fitbit price is ="+price);
	 return price;
    }
 if (name=="laptop"||amount<15000){
	 price =20000;
	 System.out.println("The laptop price is ="+amount);
	 return price;
 }else if(name=="desktops"||amount<11000){
	 price =15003;
	 System.out.println("The destops price is ="+amount);
	 return price;
    }
 if (name=="camera"||amount<7000){
	price =5001;
    System.out.println("The camera price is ="+price);
    return price;	  
 }else if(name=="smartPlug"||amount<2300){
	  price=3001;
	  System.out.println("The smartPlug price is ="+amount);
	  return price;
  }
if (name == "smartring" || price < 9500){
	amount = 8500;
	System.out.println("The smartring price is ="+amount);
	return amount;
}else if(name == "cyberband" || price < 1200){
	amount = 1150;
	System.out.println("The cyberband price is ="+amount);
	return amount;
  }
  
if  (name == "airlens" || price < 1400){
	 amount = 1350;
	 System.out.println("The airlens price is ="+amount);
	 return amount;
	 }
 else if(name == "airbotas" || price < 1400){
	 amount = 1350;
	 System.out.println("The airbotas price is ="+amount);
	 return amount;
}
}

    return price;

 }  
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

