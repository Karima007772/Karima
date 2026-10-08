public class Account {

    private int balance;

    public Account(int initBalance) {
        balance = initBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}