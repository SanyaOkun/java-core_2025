package laba2.Example7;

public class BankAccountImpl implements BankAccount {
    private String accountNumber;
    private double balance;

    @Override
    public void createAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Депозит совершен успешно. Новый баланс: " + balance);
        } else {
            System.out.println("Недопустимая сумма депозита.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие денег совершено успешно. Новый баланс: " + balance);
        } else {
            System.out.println("Недопустимая сумма снятия или недостаточный баланс.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
}
