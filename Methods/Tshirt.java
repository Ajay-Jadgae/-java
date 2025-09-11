class Tshirt{

public String brand ="Nike";
public int size =40;
public long serialNumber=656766451l;
public double price = 1599.59;
public float Discount = 10.48f;
public boolean isAvailable= true;
public char quality='A';

    public String brand(){
       System.out.println(brand);
       return brand;	
    }
	public int size(){
		System.out.println(size);
		return size;
	}
	public long serialNumber(){
		System.out.println(serialNumber);
		return serialNumber;
	}
	public double price(){
		System.out.println(price);
		return price;
	}
	public float Discount(){
		System.out.println(Discount);
		return Discount;
	}
	public boolean isAvailable(){
		System.out.println(isAvailable);
		return isAvailable;
	}
	public char quality(){
	    System.out.println(quality);
		return quality;
	}

 

}