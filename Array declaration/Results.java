class Results {

    public boolean[] status = {true, false, true, true, false};

    public void results() {
        for (int marks = 0; marks < status.length; marks++) {
            System.out.println(status[marks]);
        }
    }
}


