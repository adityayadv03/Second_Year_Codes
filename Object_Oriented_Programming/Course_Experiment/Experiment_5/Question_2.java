package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_5;
/*Author :- Aditya Yadav */
interface A //Interface test Having method Declaration
{
    int meth1(int a,int b);
    int meth2(int a,int b);
}
class My implements A //A Class implementing the interface
{
    public int meth1(int a,int b) //Defining that method
    {
        a=a+b;
        return a;
    }
    public int meth2(int a,int b) //Defining that method
    {
        a=a*b;
        return a;
    }
}
public class Question_2 //Class Name Should be MyClass According to Question
{
    public static void main(String[] args)
    {
        My obj = new My(); //Creating the Object of the class implementing the interface
        System.out.println("Sum of 2 and 3 is :- "+obj.meth1(2,3));
        System.out.println("Multiple of 2 and 3 is :- "+obj.meth2(2,3));
    }
}
