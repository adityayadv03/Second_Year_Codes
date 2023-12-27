package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_5;
/*Author :- Aditya Yadav */
interface constant
{
    double pi=3.14;
    void ar(int r);
}
class Area implements constant
{
    public void ar(int r)
    {
        float a=(float)(pi*r*r);
        System.out.println("The Radius Of Circle is :- "+a);
    }
}
public class Question_3
{
    public static void main(String[] args)
    {
        Area obj = new Area();
        obj.ar(7);
    }
}
