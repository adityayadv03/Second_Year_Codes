package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_1;
class Temp
{
    int n,m;
    Temp(int n,int m)
    {
        this.n=n;
        this.m=m;
    }
    void display()
    {
        System.out.println("Sum :- "+(n+m));
    }
}
public class Question_3
{
    public static void main(String[] args)
    {
        Temp obj = new Temp(10,20);
        obj.display();
    }    
}
