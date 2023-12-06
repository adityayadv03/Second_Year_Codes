/*Author :- Aditya Yadav */
import java.util.*; //Code To Do Basic Operation of Banking System
class InsufficientFundsException extends Exception //Custom Exception Class
{
    public InsufficientFundsException(String message)
    {
        super(message);
    }
}
class BankAccount //Class Containing all Banking System Functions
{
    int acc_bal; //To Store Balance
    String acc_hol_name; //Account Holder Name
    public BankAccount(int am,String str) //Constructor
    {
        acc_bal=am;
        acc_hol_name=str;
    }
    public void deposit(int am) //Function to Deposit Ammount
    {
        acc_bal+=am;
        System.out.println("Amount Deposit Successfully . ");
    }
    public void withdraw(int am) //Function To Withdraw
    {
        try
        {
            if(acc_bal<am) //If the Requested balance is High Then Throwing a Custom Exception
            {
                throw new InsufficientFundsException("Insufficient funds for the withdrawal . ");
            }
            else //If Condition False then Withdrawing the Requested amount
            {
                acc_bal-=am;
                System.out.println("Amount Withdrawn . ");
                System.out.println("Account Balance :- "+acc_bal);
            }
        }
        catch(Exception e)//Catching the Thrown Exception
        {
            System.out.println("Error :- "+e.getMessage());
        }
    }
}
public class Banking_System //Main Class To Implement the Banking System
{
    public static void main(String[]args)
    {
        int amount;
        BankAccount obj = new BankAccount(1000,"User_1"); //Create a Obj For any Customer
        Scanner in = new Scanner(System.in); //Giving the User Choice
        System.out.println("1.Deposit . ");
        System.out.println("2.Withdraw . ");
        System.out.print("Enter Your Choice :- ");
        int ch=in.nextInt();
        if(ch==1) //performing the operation according to the user choice
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
