package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_1; //If Error Is Produce By This Line Remove It Then Run The Code
/*Author :- Aditya Yadav */
class Num //Another Class
{
    static int a; //Static Variable
    static int b;
    public static void sum() //Static Function
    {
        System.out.println("Sum :- "+(a+b));
    }
}
public class Question_4 //Program to Implement Static Variable and Function
{
    public static void main(String[]args)
    {
        Num.a=10; //No Object Require To access variable and function Only Class Name is Sufficient
        Num.b=15;
        Num.sum();
    }
}
