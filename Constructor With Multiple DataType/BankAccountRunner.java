class BankAccountRunner{
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount();  
        
        BankAccount acc2 = new BankAccount(123456789012345L);  
        
        BankAccount acc3 = new BankAccount(123456789012345L, 5000.75f);  
        
        BankAccount acc4 = new BankAccount(123456789012345L, 5000.75f, true);  
        
        BankAccount acc5 = new BankAccount(123456789012345L, 5000.75f, true, "Ajay "); 
		
		BankAccount acc6 = new BankAccount(123456789012345L, 5000.75f, true, "Ajay ",100);  

        BankAccount acc7 = new BankAccount(123456789012345L, 5000.75f, true, "Ajay ",100,'A');  

    }
}


