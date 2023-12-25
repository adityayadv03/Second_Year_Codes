package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
class C
{
    int a=100;
}
public class Question_8
{
    public static void main(String[] args)
    {
        C obj = new C();
        if(obj instanceof C)
        {
            System.out.println("Obj is the Object of C Class . ");
        }
        else
        {
            System.out.println("Obj is not the Object of C Class . ");
        }
    }
}
