package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_1; //If Error Is Produce By This Line Remove It Then Run The Code
/*Author :- Aditya Yadav */
class Temp //Class Containing All Variable and Function
{
    int n,m;
    Temp(int n,int m) //Counstrutor 
    {
        this.n=n;
        this.m=m;
    }
    void display() //Function To Do Sum
    {
        System.out.println("Sum :- "+(n+m));
    }
}
public class Question_3 //Program to Add Two Number Present in Another Class
{
    public static void main(String[] args)
    {
        Temp obj = new Temp(10,20); //Creating Object of Other Class
        obj.display(); //Calling Function
    }    
}
