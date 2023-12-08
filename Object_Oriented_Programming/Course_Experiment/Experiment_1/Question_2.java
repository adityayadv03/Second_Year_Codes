package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_1; //If Error Is Produce By This Line Remove It Then Run The Code
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_2 //Basic Code For Sum
{
    public static void main(String[]args)
    {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two Integer :- "); //Input From The User
        a=in.nextInt();
        b=in.nextInt();
        int c=a+b;
        System.out.println("Sum :- "+c);
        in.close();
    }
}
