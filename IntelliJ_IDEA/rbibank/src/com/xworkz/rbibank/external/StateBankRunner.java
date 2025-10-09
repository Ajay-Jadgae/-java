package com.xworkz.rbibank.external;
import  com.xworkz.rbibank.internal.StateBank;
public class StateBankRunner {

    public static void main(String[] args) {
        StateBank statebank=new StateBank("sib",8.2);

        statebank.displayBankName();
        statebank.displayBankIntrest();


    }
}
