package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number :- ");
        int a=in.nextInt();
        System.out.println("The Absolute Value is :- "+(a<0?-a:a));
        in.close();
    }
}
