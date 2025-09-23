package in.kgcoding.Practice;

public class BankHolder {
    public static void main(String[] args) {
        Account acc = new Account(987111,1000);
        System.out.println("Holder account is " +acc.AccountNUmber);
        System.out.println("Holder Balance is " +acc.getBalance());
        acc.setBalance(40000);
        System.out.println(acc.getBalance());
    }

}
