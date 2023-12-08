package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_1; //If Error Is Produce By This Line Remove It Then Run The Code
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_6 //Program To Calculate area of Crcle and Using Final Keyword
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius :- "); //Taking Radius From User
        float ra=in.nextFloat();
        final double pi=3.14; //Final Keyword Use To Set the Value Of Pi Once in the Life Time Of Program
        double area;
        area=pi*ra*ra;
        System.out.println("Area of Circle is :- "+area); //Printing the Area
        in.close();
    }    
}
