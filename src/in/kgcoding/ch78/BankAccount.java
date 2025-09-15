package in.kgcoding.ch78;

class BankAccount {
    private String AccountNumber;
    private String AccountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        AccountNumber = accountNumber;
        AccountHolderName = accountHolderName;
    }

    public void deposit(double money){
        if (money <=0){
            System.out.println("Invalid Deposit");
        }
        balance+=money;

    }
    public double withdrawMoney(double money){
        if (balance >= money){
            balance -= money;
        }
        else if (money <= balance){
            System.out.println("invalid amount");
        }
        else {
            money = balance;
            balance = 0;
        }
        return money;
    }
}
