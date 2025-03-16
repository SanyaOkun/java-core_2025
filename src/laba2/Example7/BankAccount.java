package laba2.Example7;

public interface BankAccount {
     //Создает новый банковский счет с заданным номером и балансом.
     //@param accountNumber номер банковского счета
     //@param balance начальный баланс
    void createAccount(String accountNumber, double balance);

     //Совершает депозит на заданную сумму.
     //@param amount сумма депозита
    void deposit(double amount);

     //Совершает снятие денег на заданную сумму.
     //@param amount сумма снятия
    void withdraw(double amount);

     //Возвращает текущий баланс.
     //@return текущий баланс
    double getBalance();

     //Возвращает номер банковского счета.
     //@return номер банковского счета
    String getAccountNumber();
}