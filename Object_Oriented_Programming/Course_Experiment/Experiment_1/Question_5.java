package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_1; //If Error Is Produce By This Line Remove It Then Run The Code
/*Author :- Aditya Yadav */
import java.util.*;
class Te //Another Class
{
    int a,b;
    void inp() //Function to Take Input
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two Integer :- ");
        a=in.nextInt();
        b=in.nextInt();
        in.close();
    }
    void sum() //Function to Sum and Display
    {
        System.out.println("Sum :- "+(a+b));
    }
}
public class Question_5 //Program to implement Non static variable and Function
{
    public static void main(String[]args)
    {
        Te obj = new Te(); //Object Created by new Keyword to call function of Other Class
        obj.inp(); //Function Call
        obj.sum(); //Function Call
    }    
}
