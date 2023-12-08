package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_1;
import java.util.*;
class Te
{
    int a,b;
    void inp()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two Integer :- ");
        a=in.nextInt();
        b=in.nextInt();
        in.close();
    }
    void sum()
    {
        System.out.println("Sum :- "+(a+b));
    }
}
public class Question_5
{
    public static void main(String[]args)
    {
        Te obj = new Te();
        obj.inp();
        obj.sum();
    }    
}
