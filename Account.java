//program to open a bank account and withdra etc etc

public class Account
{
    double balance;
    Account()//default constructor
    {
        balance=0;
    }
    void startAccount(double amt)
    {
        balance=amt;
    }
    void deposit(double amount)
    {
        balance+=amount;
    }
    void withdraw(double b)
    {
        balance-=b;
    }
    double getBalance()
    {
        return balance;
    }
}