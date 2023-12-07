/*Author :- Aditya Yadav */
import java.util.*;
class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String str)
    {
        super(str);
    }
}
class Invaliddeposit extends Exception
{
    public Invaliddeposit(String str)
    {
        super(str);
    }
}
class Account
{
    int bal;
    public Account(int bal)
    {
        this.bal=bal;
    }
    public boolean isSufficientBalance(int amt)
    {
        if(bal>=amt)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void withdraw(int amount)
    {
        bal=bal-amount;
        System.out.println("Amount Withdrawn . ");
        System.out.println("Balance Remaining :- "+bal);
    }
    public void deposit(int amount)
    {
        bal=bal+amount;
        System.out.println("Amount Deposited . ");
        System.out.println("Current Balance :- "+bal);
    }
}
class Customer implements Runnable
{
    String name;
    Account acc;
    public Customer(Account acc,String name)
    {
        this.acc=acc;
        this.name=name;
    }
    public void run()
    {
        synchronized(acc)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("1.Deposit . ");
            System.out.println("2.Withdraw . ");
            System.out.print("Hello "+name+" Please Enter Your Choice :- ");
            int ch=in.nextInt();
            int amt;
            if(ch==1)
            {
                System.out.print("Enter Amount To Deposit :- ");
                amt=in.nextInt();
                try
                {
                    if(amt>0)
                    {
                        acc.deposit(amt);
                    }
                    else
                    {
                        throw new Invaliddeposit("The Depositing Amount Can't be Negative Or Zero ");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Error :- "+e.getMessage());
                }
            }
            else if(ch==2)
            {
                System.out.print("Enter Amount To Withdraw :- ");
                amt=in.nextInt();
                try
                {
                    if(acc.isSufficientBalance(amt))
                    {
                        System.out.println(name);
                        acc.withdraw(amt);
                    }
                    else
                    {
                        throw new InsufficientFundsException("Insufficient Balance Can't Withdraw Requested Ammount . ");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Error :- "+e.getMessage());
                }
            }
        }
    }
}
public class Banking_System_Multithread
{
    public static void main(String[]args)
    {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1,"Varun");
        Customer c2 = new Customer(a1,"Vansh");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
