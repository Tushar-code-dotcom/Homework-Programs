class AccountDemo
{
    public static void main()
    {
        Account my_account=new Account();
        my_account.startAccount(1000);
        my_account.deposit(250.00);
        
        System.out.println("current balance"+my_account.getBalance());
        my_account.withdraw(80.00);
        
        System.out.println("Remaining balance "+my_account.getBalance());
    }
}