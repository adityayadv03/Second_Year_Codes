//package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_2; //If Error Is Produce By This Line Remove It Then Run The Code
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_1 //Program To Find Factorial
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number :- "); //Taking Number from User
        int n=in.nextInt();
        Integer fac=1; //A Instance of wrapper Class to store factorial
        for(int i=1 ; i<=n ; i++) //Calculating Factorial
        {
            fac=fac*i;
        }
        System.out.println("Factorial Of Given Number is :- "+fac); //Printing Factorial
        in.close();
    }
}
