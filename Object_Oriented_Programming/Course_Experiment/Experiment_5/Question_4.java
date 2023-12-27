package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_5;
/*Author :- Aditya Yadav */
interface two
{
    void div(int a,int b);
    void mod(int a,int b);
}
class Ride implements two
{
    public void div(int a,int b)
    {
        float c=(float)(a/b);
        System.out.println("The Division of "+a+" "+b+" is :- "+c);
    }
    public void mod(int a,int b)
    {
        int c=a%b;
        System.out.println("The Modulus of "+a+" "+b+" is :- "+c);
    }
}
public class Question_4
{
    public static void main(String[] args)
    {
        Ride obj = new Ride();
        obj.div(3,2);
        obj.mod(3,2);
    }
}
