class KeyBoardRunner{
	
	public static void main (String [] args){
		
		KeyBoardInfo info=new KeyBoardInfo();
		
		KeyBoard one =new KeyBoard(500,"hp",'A',1224313154l);
		KeyBoard two =new KeyBoard(200,"dell",'A',122254514l);
		KeyBoard three =new KeyBoard(600,"lenova",'B',128989883154l);
		
		KeyBoard [] brands={one,two,three};
		
		info.information(brands);
		
		
	}
}