package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_3 //Program to Print First N Fibonacci Series
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Limit :- "); //Taking the Value of N
        int n=in.nextInt();
        int a,b,sum=0; //Taking 3 Value to Calculate the Fibonacci Series
        a=0;
        b=1;
        System.out.print("Fibonacci Series :- ");
        for(int i=1 ; i<=n ; i++) //Calculating and Printing The Fibonacci Series
        {
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
        in.close();
    }
}
