package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_7;
/*Author :- Aditya Yadav */
public class Question_3 //program to check if the operand performing modulus is nonnumeric or not
{
    public static void main(String[] args)
    {
        try
        {
            int a=Integer.parseInt(args[0]); //Converting the string argument to int
            int b=Integer.parseInt(args[1]); //If the argument are nonnumeric it will create a exception which is get catch by catch block
            System.out.println("Modulus is :- "+(a%b));
        }
        catch(Exception e)
        {
            System.out.println("Error is :- "+e.getMessage()); //Showing the message of exception with the help if getMessage Function
        }
    }
}
