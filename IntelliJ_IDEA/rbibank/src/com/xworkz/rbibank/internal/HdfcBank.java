package com.xworkz.rbibank.internal;

public class HdfcBank extends RbiBank{

    public  String bankName;
    public   double intrest;

    public  HdfcBank(String bankName,double intrest){

        this.bankName=bankName;
        this.intrest=intrest;

    }

    @Override
    public void displayBankName() {
        System.out.println("the bank name is="+bankName);

    }
    @Override
    public void displayBankIntrest() {
        System.out.println("The bank interest is = " + intrest);
    }
}
