package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3;
/*Author :- Aditya Yadav */
public class Question_2 //Program to Add Two Number from command Line Arguments
{
    public static void main(String[] args) //When we run code in command line after the Command the number are given and store in args array
    {
        int a=Integer.parseInt(args[0]); //Converting the arguments to Interger
        int b=Integer.parseInt(args[1]); //Converting the arguments to Interger
        System.out.println("Sum :- "+(a+b)); //Printing the Sum
    }
}
