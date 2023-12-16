/*Author :- Aditya Yadav */
import java.util.*;
public class Question_8
{
    public static void pattern1(int n)
    {
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1 ; i>=0 ; i--)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=n-i ; j++)
            {
                System.out.print(" ");
            }
            for(int k=1 ; k<=((2*i)-1) ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Pattern 1 . ");
        System.out.println("2.Pattern 2 . ");
        System.out.print("Enter your Choice :- ");
        int ch=in.nextInt();
        System.out.print("Enter the Limit Of Pattern :- ");
        int lim=in.nextInt();
        if(ch==1)
        {
            pattern1(lim);
        }
        else if(ch==2)
        {
            pattern2(lim);
        }
        else
        {
            System.out.println("Wrong Choice . ");
        }
        in.close();
    }
}