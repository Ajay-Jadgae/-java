class Mall{

public int noOfCaps;
public String capCode;


public Mall(int numbers ,String capColors){
	
	this.noOfCaps=numbers;
	this.capCode=capColors;
}
	
public void mallDisplay(){
	
	System.out.println(noOfCaps+","+capCode);
}	
	
}

