package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_5 //Program to Implement ternary Operator and finding absolute Value
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number :- "); //Taking Number From the User
        int a=in.nextInt();
        System.out.println("The Absolute Value is :- "+(a<0?-a:a)); //Using Ternary Operator and Finding Absolute Value
        in.close();
    }
}
