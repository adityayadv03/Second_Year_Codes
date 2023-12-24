package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_6 //Program To Find and Implement Bitwise AND OR XOR Operator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number :- "); //Taking two Number
        int a=in.nextInt();
        System.out.print("Enter Second Number :- ");
        int b=in.nextInt();
        System.out.println("Bitwise AND Between a and b is :- "+(a&b)); //Bitwise AND Operator
        System.out.println("Bitwise OR Between a and b is :- "+(a|b)); //Bitwise OR Operator
        System.out.println("Bitwise XOR Between a and b is :- "+(a^b)); //Bitwise XOR Operator
        in.close();
    }
}
