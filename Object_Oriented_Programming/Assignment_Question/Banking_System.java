import java.util.*;
class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String message)
    {
        super(message);
    }
}
class BankAccount
{
    int acc_bal;
    String acc_hol_name;
    public BankAccount(int am,String str)
    {
        acc_bal=am;
        acc_hol_name=str;
    }
    public void deposit(int am)
    {
        acc_bal+=am;
        System.out.println("Amount Deposit Successfully . ");
    }
    public void withdraw(int am)
    {
        try
        {
            if(acc_bal<am)
            {
                throw new InsufficientFundsException("Insufficient funds for the withdrawal . ");
            }
            else
            {
                acc_bal-=am;
                System.out.println("Amount Withdrawn . ");
                System.out.println("Account Balance :- "+acc_bal);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error :- "+e.getMessage());
        }
    }
}
public class Banking_System
{
    public static void main(String[]args)
    {
        int amount;
        BankAccount obj = new BankAccount(1000,"User_1");
        Scanner in = new Scanner(System.in);
        System.out.println("1.Deposit . ");
        System.out.println("2.Withdraw . ");
        System.out.print("Enter Your Choice :- ");
        int ch=in.nextInt();
        if(ch==1)
        {
            System.out.print("Enter the Amount To Deposit :- ");
            amount=in.nextInt();
            obj.deposit(amount);
        }
        else if(ch==2)
        {
            System.out.print("Enter the Amount To WithDraw :- ");
            amount=in.nextInt();
            obj.withdraw(amount);
        }
        in.close();
    }
}
