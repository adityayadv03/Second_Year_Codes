package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3;
import java.util.*;
public class Question_5
{
    public static void display(int ar[])
    {
        System.out.println("Marks\t\tGrade");
        for (int i=0 ; i<10 ; i++) 
        {
            int mark=ar[i];
            String grade="FAIL";
            if(mark>=40 && mark<=50)
            {
                grade="PASS";
            } 
            else if(mark>=31 && mark<=75)
            {
                grade = "MERIT";
            }
            else if(mark>75)
            {
                grade="DISTINCTION";
            }
            System.out.println(mark + "\t\t" + grade);
        }
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Marks Of Ten Student :- ");
        int arr[] = new int[10];
        for(int i=0 ; i<10 ; i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0 ; i<10 ; i++)
        {
            for(int j=0 ; j<10-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        display(arr);
        in.close();
    }
}
