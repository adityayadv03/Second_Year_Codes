package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_6 //Program to Find the Square of ten Number and Store their Sum
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[10];
        int temp,sum=0;
        System.out.print("Enter Ten Element :- "); //Taking 10 Number From User
        for(int i=0 ; i<10 ; i++)
        {
            temp=in.nextInt();
            arr[i]=temp*temp; //Calculating their Sum
            sum=sum+arr[i]; //Calculating their Sum
        }
        System.out.print("Array After Updation :- "); //Printing thier Updated Value
        for(int i=0 ; i<10 ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Sum of Updated Element :- "+sum); //Printing Their Sum
        in.close();
    }
}
