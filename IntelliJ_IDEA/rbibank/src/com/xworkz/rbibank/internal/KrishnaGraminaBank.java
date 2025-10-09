package com.xworkz.rbibank.internal;

public class KrishnaGraminaBank extends RbiBank {

    public String bankName;
    public double interest;

    public KrishnaGraminaBank(String bankName, double interest) {
        this.bankName = bankName;
        this.interest = interest;
    }

    @Override
    public void displayBankName() {
        System.out.println("The bank name is = " + bankName);
    }

    @Override
    public void displayBankIntrest() {
        System.out.println("The bank interest is = " + interest);
    }
}

