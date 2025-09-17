class Mobile{

public int rate;

public Charger charger;

public Mobile(int rate){

this.rate=rate;

}

public void display(Charger charger){

this.charger=charger;

System.out.println(rate);

}
}