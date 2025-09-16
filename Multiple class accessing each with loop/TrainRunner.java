class TrainRunner {
    public static void main(String[] args) {
        Train train = new Train();

        TrainInfo train1 = new TrainInfo("Rajdhani Express", 1295);
        TrainInfo train2 = new TrainInfo("Shatabdi Express", 12009);
        TrainInfo train3 = new TrainInfo("Duronto Express", 12245);

        TrainInfo[] trainList = { train1, train2, train3 };
        train.displayTrains(trainList);
    }
}
