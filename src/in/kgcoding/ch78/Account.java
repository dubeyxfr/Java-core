package in.kgcoding.ch78;

public class Account {
    public static void main(String[] args) {
        BankAccount Acc = new BankAccount("250971","Prashant");
        Acc.deposit(100);
        Acc.withdrawMoney(2000);
    }
}
