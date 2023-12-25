package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_7
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number :- ");
        int a=in.nextInt();
        System.out.print("Enter Number of Bits to Shift :- ");
        int b=in.nextInt();
        System.out.println("Left Shift of Given Number is :- "+(a<<b));
        System.out.println("Right Shift of Given Number is :- "+(a>>b));
        in.close();
    }
}
