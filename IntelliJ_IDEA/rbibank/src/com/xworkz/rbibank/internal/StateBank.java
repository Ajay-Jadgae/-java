package com.xworkz.rbibank.internal;

public class StateBank extends RbiBank{

    public  String bankName;
    public double intrest;

    public  StateBank(String bankName,double intrest){

        this.bankName=bankName;
        this.intrest=intrest;
    }

    @Override
    public void displayBankIntrest() {
        System.out.println("the bank name is ="+bankName);

    }

    @Override
    public void displayBankName() {
        System.out.println("the bank intrest is ="+intrest);
    }
}
