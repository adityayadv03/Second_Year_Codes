package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_7;
/*Author :- Aditya Yadav */
public class Question_3
{
    public static void main(String[] args)
    {
        try
        {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            System.out.println("Modulus is :- "+(a%b));
        }
        catch(Exception e)
        {
            System.out.println("Error is :- "+e.getMessage());
        }
    }
}
