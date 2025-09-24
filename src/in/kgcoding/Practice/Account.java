package in.kgcoding.Practice;

public class Account {
    private int AccountNUmber;
    private int balance;

    public Account(int accountNUmber, int balance) {
        AccountNUmber = accountNUmber;
        this.balance = balance;
    }

    public int getAccountNUmber() {
        return AccountNUmber;
    }

    public void setAccountNUmber(int accountNUmber) {
        AccountNUmber = accountNUmber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
