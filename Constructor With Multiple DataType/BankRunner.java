class BankRunner {
    public static void main(String[] args) {
        
        Bank bank1 = new Bank();
		
        Bank bank2 = new Bank("SBI");
		
        Bank bank3 = new Bank("SBI", "MG Road");
		
        Bank bank4 = new Bank("SBI", "MG Road", 150);
		
        Bank bank5 = new Bank("SBI", "MG Road", 150, 20000);
		
        Bank bank6 = new Bank("SBI", "MG Road", 150, 20000, 50000000.50);
		
        Bank bank7 = new Bank("SBI", "MG Road", 150, 20000, 50000000.50, true);
		
        Bank bank8 = new Bank("SBI", "MG Road", 150, 20000, 50000000.50, true, 'A');
    }
}
