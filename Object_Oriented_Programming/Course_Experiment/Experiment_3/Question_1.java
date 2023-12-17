package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3; //If Error Is Produce By This Line Remove It Then Run The Code
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter three Number :- ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println("The First Number "+a+" is Greatest . ");
        }
        else if((b>a)&&(b>c))
        {
            System.out.println("The Second Number "+b+" is Greatest . ");
        }
        else if((c>a)&&(c>b))
        {
            System.out.println("The Third Number "+c+" is Greatest . ");
        }
        in.close();
    }
}
