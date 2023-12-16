/*Author :- Aditya Yadav */
import java.util.*;
public class Question_8 //Program to Print Pattern 
{
    public static void pattern1(int n) //Function to Print the First Pattern with limit as argument
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
    public static void pattern2(int n) //Function to Print Pattern 2 and Limit as Argument
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
        System.out.println("1.Pattern 1 . "); //Option One
        System.out.println("2.Pattern 2 . "); //Option two
        System.out.print("Enter your Choice :- "); //Asking for Choice
        int ch=in.nextInt();
        System.out.print("Enter the Limit Of Pattern :- "); //Asking for pattern length
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
            System.out.println("Wrong Choice . "); //Message for Wrong Option
        }
        in.close();
    }
}
