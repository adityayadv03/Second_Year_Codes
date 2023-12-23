package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_4 //Program to Find Maximum Number Using Ternary Operator
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter First Number :- "); //Taking Number One
		int a=in.nextInt();
		System.out.print("Enter Second Number :- "); //Taking Number Two
		int b=in.nextInt();
		System.out.println("The Larger Number is :- "+(a>b?a:b)); // Implementing Ternary Operator
        in.close();
	}
}
