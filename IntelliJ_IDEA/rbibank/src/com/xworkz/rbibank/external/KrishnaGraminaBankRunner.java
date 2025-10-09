package com.xworkz.rbibank.external;
import com.xworkz.rbibank.internal.KrishnaGraminaBank;
public class KrishnaGraminaBankRunner {

    public static void main(String[] args) {
        KrishnaGraminaBank krishna=new KrishnaGraminaBank("kgb",9.2);
        krishna.displayBankName();
        krishna.displayBankIntrest();
    }
}
