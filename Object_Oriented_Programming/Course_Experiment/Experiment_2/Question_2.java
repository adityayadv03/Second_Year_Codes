/*Author :- Aditya Yadav */
import java.util.*;
public class Question_2 //Program to Print the sum of First N Numbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the Limit :- "); //Taking the N From the User
        int n=in.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
            sum+=i; //Calculating the Sum
        }
        System.out.println("Sum of First "+n+" Natural Number is :- "+sum); //Printing the Sum
        in.close();
    }
}
