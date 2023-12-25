package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
class C //A Class To Implement the instanceod method
{
    int a=100;
}
public class Question_8 //Program to implement instanceof Method
{
    public static void main(String[] args)
    {
        C obj = new C(); //Creating a Instance of Class C
        if(obj instanceof C) //Checking whether the instance is of Class C with instanceof Method
        {
            System.out.println("Obj is the Object of C Class . ");
        }
        else
        {
            System.out.println("Obj is not the Object of C Class . ");
        }
    }
}
