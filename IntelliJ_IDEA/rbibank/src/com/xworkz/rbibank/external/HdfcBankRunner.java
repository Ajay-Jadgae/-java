package com.xworkz.rbibank.external;
import com.xworkz.rbibank.internal.HdfcBank;
public class HdfcBankRunner {

    public static void main(String[] args) {
        HdfcBank bank=new HdfcBank("hdfc",5.2);
        bank.displayBankName();
        bank.displayBankIntrest();
    }

}
