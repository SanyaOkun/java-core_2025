package laba2.Example7;

public class Example7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccountImpl();
        account.createAccount("1234567890", 500.0);

        System.out.println("Начальный баланс: " + account.getBalance());

        account.deposit(500.0);
        account.withdraw(200.0);

        System.out.println("Текущий баланс: " + account.getBalance());

        System.out.println("Номер банковского счета: " + account.getAccountNumber());
    }
}
