package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Limit :- ");
        int n=in.nextInt();
        int a,b,sum=0;
        a=0;
        b=1;
        System.out.print("Fibonacci Series :- ");
        for(int i=1 ; i<=n ; i++)
        {
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
        in.close();
    }
}
