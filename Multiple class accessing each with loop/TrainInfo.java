class TrainInfo {
    public String trainName;
    public int trainNo;


    public TrainInfo(String trainName, int trainNo) {
        this.trainName = trainName;
        this.trainNo = trainNo;
        
	}
    public void displayTrainInfo(){
        System.out.println(trainName);
        System.out.println(trainNo);
    }
}


