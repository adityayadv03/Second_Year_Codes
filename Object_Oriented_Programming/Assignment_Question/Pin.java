/*Author :- Aditya Yadav */
import java.util.*;
class WrongPinException extends Exception //Throwing Custom Exception
{
    public WrongPinException(String message)
    {
        super(message); //Printing Custom Message For Exception
    }
}
public class Pin //Code About Exception Handling and Checking Pin
{
    final int pin=1234; //A Default Pin
    public static boolean check(int x) //Function To Check Whether The Pin is Correct or Not
    {
        boolean re=false;
        Pin obj = new Pin();
        if(x==obj.pin)
        {
            re=true;
        }
        return re;
    }
    public static void main(String[]args)
    {
        int pin_e;
        Scanner in = new Scanner(System.in);
        int count=0;
        do
        {
            System.out.print("Enter the Pin :- "); //Taking Users Pin
            pin_e=in.nextInt();
            if(check(pin_e)==false) //Checking Whether The Pin is Correct Or Not
            {
                count++; //Counting the Number Of Wrong Try
                if(count!=3)
                {
                    System.out.println("Wrong Pin . "); //Telling the User That he has Enter Wrong Pin
                    System.out.println("Remaining Try :- "+(3-count)); //Printing Remaining Try
                }
            }
            else
            {
                System.out.println("Access granted! User information displayed . "); //If He Enter Right Pin Printing The Fruitfull Message
            }
            try
            {
                if(count>=3) //If the Try Limit Exceeds Then Throwing the Exception
                {
                    throw new WrongPinException("Account Blocked Temporary . ");
                }
            }
            catch(Exception e)
            {
                System.out.println("Error :- "+e.getMessage()); //Printing the Error to User
                break;
            }
        }while(check(pin_e)!=true);
        in.close();
    }
}
