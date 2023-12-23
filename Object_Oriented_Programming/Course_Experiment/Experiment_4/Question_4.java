package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_4
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter First Number :- ");
		int a=in.nextInt();
		System.out.print("Enter Second Number :- ");
		int b=in.nextInt();
		System.out.println("The Larger Number is :- "+(a>b?a:b));
        in.close();
	}
}
