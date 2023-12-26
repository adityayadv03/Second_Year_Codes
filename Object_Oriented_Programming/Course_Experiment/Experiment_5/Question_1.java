package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_5;
/*Author :- Aditya Yadav */
interface test
{
    int square(int x);
}
class arithmetic implements test
{
    public int square(int x)
    {
        x=x*x;
        return x;
    }
}
public class Question_1 //Class Name Should be ToTestInt According to Question
{
    public static void main(String[] args)
    {
        arithmetic obj = new arithmetic();
        System.out.println("Square of 2 is :- "+obj.square(2));
    }
}
