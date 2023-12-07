/*Author :- Aditya Yadav */
import java.util.*;
class InsufficientFundsException extends Exception //Custom Exception Class For Insufficient Funds
{
    public InsufficientFundsException(String str) //Constructor to create a Custom Message
    {
        super(str);
    }
}
class Invaliddeposit extends Exception //Custom Exception Class For Negative Deposit
{
    public Invaliddeposit(String str) //Constructor to create a Custom Message
    {
        super(str);
    }
}
class Account //Class To Implement Banking system with Different Funds
{
    int bal;
    public Account(int bal) //Costructor to Initialize Balance
    {
        this.bal=bal;
    }
    public boolean isSufficientBalance(int amt) //Function to Check wheather Balance is Sufficient or Not
    {
        if(bal>=amt)
        {
            return true; //Return true if Sufficient Amount is there to Withdraw
        }
        else
        {
            return false;
        }
    }
    public void withdraw(int amount) //Function to Withdraw
    {
        bal=bal-amount;
        System.out.println("Amount Withdrawn . ");
        System.out.println("Balance Remaining :- "+bal);
    }
    public void deposit(int amount) //Function to Deposit
    {
        bal=bal+amount;
        System.out.println("Amount Deposited . ");
        System.out.println("Current Balance :- "+bal);
    }
}
class Customer implements Runnable //Implementing Thread Using The Runnable Interface
{
    String name;
    Account acc;
    public Customer(Account acc,String name) //Custructor To Initizalise the name and account class Reference
    {
        this.acc=acc;
        this.name=name;
    }
    public void run() //Thread Code Run After Creation
    {
        synchronized(acc) //Synchronized Block So That One Thread Can Access The Critical Section
        {
            Scanner in = new Scanner(System.in);
            System.out.println("1.Deposit . ");
            System.out.println("2.Withdraw . ");
            System.out.print("Hello "+name+" Please Enter Your Choice :- "); //Taking User Choice
            int ch=in.nextInt();
            int amt;
            if(ch==1)
            {
                System.out.print("Enter Amount To Deposit :- "); //Depositing Amount
                amt=in.nextInt();
                try
                {
                    if(amt>0)
                    {
                        acc.deposit(amt);
                    }
                    else
                    {
                        throw new Invaliddeposit("The Depositing Amount Can't be Negative Or Zero "); //Throwing Exception
                    }
                }
                catch(Exception e) //Catching the Thrown Exception
                {
                    System.out.println("Error :- "+e.getMessage());
                }
            }
            else if(ch==2)
            {
                System.out.print("Enter Amount To Withdraw :- "); //Withdrawing Amount
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
                        throw new InsufficientFundsException("Insufficient Balance Can't Withdraw Requested Ammount . "); //Throwing Exception
                    }
                }
                catch(Exception e) //Catching the Thrown Exception
                {
                    System.out.println("Error :- "+e.getMessage());
                }
            }
        }
    }
}
public class Banking_System_Multithread //Main Class To Implement The Multithread Synchronization
{
    public static void main(String[]args)
    {
        Account a1 = new Account(1000); //Account Use as a Shared Variable
        Customer c1 = new Customer(a1,"Varun"); //Thread One
        Customer c2 = new Customer(a1,"Vansh"); //Thread Two
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start(); //Creating and Starting Thread
        t2.start(); //Creating and Starting Thread
    }
}
