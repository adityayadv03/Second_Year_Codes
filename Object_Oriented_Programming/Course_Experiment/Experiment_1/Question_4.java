package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_1;
class Num
{
    static int a;
    static int b;
    public static void sum()
    {
        System.out.println("Sum :- "+(a+b));
    }
}
public class Question_4
{
    public static void main(String[]args)
    {
        Num.a=10;
        Num.b=15;
        Num.sum();
    }
}
