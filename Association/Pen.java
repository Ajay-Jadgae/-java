class Pen{

public int price;

public String name;

public PenCap penCap;


public Pen(int price,String name,PenCap penCap ){

this.price=price;
this.name=name;
this.penCap=penCap;
}
public void displayPen(){

System.out.println("-----="+price);
System.out.println("-----="+name);
System.out.println("-----="+penCap.brand);
System.out.println("-----="+penCap.rating);
}
}