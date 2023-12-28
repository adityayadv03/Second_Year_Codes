package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_7;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_2 //Program to handle exception cause by division by 0
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any Number :- "); //Taking the First Number
        int a=in.nextInt();
        System.out.print("Enter Any Number :- "); //Taking the Second Number
        int b=in.nextInt();
        in.close();
        try
        {
            System.out.println("Division :- "+(a/b)); //If the Division Cause any Error
        }
        catch(Exception e) //Exception catch from the try block
        {
            System.out.println("Error Occur :- "+e.getMessage()); //Then Printing the Error Using the getMessage function
        }
    }
}
