class Shop{

   public void price(Mall [] mall){
	
    System.out.println(mall.length);

    for (int num=0;num<mall.length;num++){
	
         Mall details=mall[num];
 
         details.mallDisplay();
}	
}

}

