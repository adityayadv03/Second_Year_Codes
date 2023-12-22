package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_6
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[10];
        int temp,sum=0;
        System.out.print("Enter Ten Element :- ");
        for(int i=0 ; i<10 ; i++)
        {
            temp=in.nextInt();
            arr[i]=temp*temp;
            sum=sum+arr[i];
        }
        System.out.print("Array After Updation :- ");
        for(int i=0 ; i<10 ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Sum of Updated Element :- "+sum);
        in.close();
    }
}
