import java.util.*;
class WrongPinException extends Exception
{
    public WrongPinException(String message)
    {
        super(message);
    }
}
public class Pin
{
    final int pin=1234;
    public static boolean check(int x)
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
            System.out.print("Enter the Pin :- ");
            pin_e=in.nextInt();
            if(check(pin_e)==false)
            {
                count++;
                if(count!=3)
                {
                    System.out.println("Wrong Pin . ");
                    System.out.println("Remaining Try :- "+(3-count));
                }
            }
            else
            {
                System.out.println("Access granted! User information displayed . ");
            }
            try
            {
                if(count>=3)
                {
                    throw new WrongPinException("Account Blocked Temporary . ");
                }
            }
            catch(Exception e)
            {
                System.out.println("Error :- "+e.getMessage());
                break;
            }
        }while(check(pin_e)!=true);
        in.close();
    }
}
