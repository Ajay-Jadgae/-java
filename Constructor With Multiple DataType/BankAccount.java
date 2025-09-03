class BankAccount {

    public BankAccount() {
        System.out.println("Default Bank Account Constructor");
    }

    public BankAccount(long accountNumber) {
        System.out.println("Account Number = " + accountNumber);
    }

    public BankAccount(long accountNumber, float balance) {
        System.out.println("Balance = " + balance);
    }

    public BankAccount(long accountNumber, float balance, boolean isActive) {
        System.out.println("Account Active = " + isActive);
    }

    public BankAccount(long accountNumber, float balance, boolean isActive, String holderName) {
        System.out.println("Account Holder = " + holderName);
    }
    public BankAccount(long accountNumber, float balance, boolean isActive, String holderName,int num){
	    System.out.println("num = " + num);
	}
    public BankAccount(long accountNumber, float balance, boolean isActive, String holderName,int num,char grade){
	    System.out.println("grade = " + grade);
    }
}
