package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_2;
import java.util.*;
public class Question_1
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number :- ");
        int n=in.nextInt();
        Integer fac=1;
        for(int i=1 ; i<=n ; i++)
        {
            fac=fac*i;
        }
        System.out.println("Factorial Of Given Number is :- "+fac);
        in.close();
    }
}