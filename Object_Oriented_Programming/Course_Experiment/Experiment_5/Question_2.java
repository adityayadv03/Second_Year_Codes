package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_5;
/*Author :- Aditya Yadav */
interface A
{
    int meth1(int a,int b);
    int meth2(int a,int b);
}
class My implements A
{
    public int meth1(int a,int b)
    {
        a=a+b;
        return a;
    }
    public int meth2(int a,int b)
    {
        a=a*b;
        return a;
    }
}
public class Question_2 //Class Name Should be MyClass According to Question
{
    public static void main(String[] args)
    {
        My obj = new My();
        System.out.println("Sum of 2 and 3 is :- "+obj.meth1(2,3));
        System.out.println("Multiple of 2 and 3 is :- "+obj.meth2(2,3));
    }
}
