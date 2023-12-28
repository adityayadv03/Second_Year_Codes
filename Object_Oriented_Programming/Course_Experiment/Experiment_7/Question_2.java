package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_7;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any Number :- ");
        int a=in.nextInt();
        System.out.print("Enter Any Number :- ");
        int b=in.nextInt();
        in.close();
        try
        {
            System.out.println("Division :- "+(a/b));
        }
        catch(Exception e)
        {
            System.out.println("Error Occur :- "+e.getMessage());
        }
    }
}
