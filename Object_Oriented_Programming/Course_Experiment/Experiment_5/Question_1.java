package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_5;
/*Author :- Aditya Yadav */
interface test //Interface test Having method Declaration
{
    int square(int x);
}
class arithmetic implements test //A Class implementing the interface
{
    public int square(int x) //Defining that method
    {
        x=x*x;
        return x;
    }
}
public class Question_1 //Class Name Should be ToTestInt According to Question
{
    public static void main(String[] args)
    {
        arithmetic obj = new arithmetic(); //Creating the Object of the class implementing the interface
        System.out.println("Square of 2 is :- "+obj.square(2));
    }
}
