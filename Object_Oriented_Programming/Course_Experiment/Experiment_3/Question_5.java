package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3;
/*Author :- Aditya Yadav */
import java.util.*;
public class Question_5 //Program to Print the Grade According to Given Marks
{
    public static void display(int ar[]) //Function To Print the Grade
    {
        System.out.println("Marks\t\tGrade");
        for (int i=0 ; i<10 ; i++) 
        {
            int mark=ar[i];
            String grade="FAIL"; //Default Condition Assuming the Grade is Fail
            if(mark>=40 && mark<=50) //Grade is Pass for marks between 40 to 50
            {
                grade="PASS";
            } 
            else if(mark>=31 && mark<=75) //Grade is Merit for marks between 40 to 50
            {
                grade = "MERIT";
            }
            else if(mark>75) //Grade is Distinction for marks between 40 to 50
            {
                grade="DISTINCTION";
            }
            System.out.println(mark + "\t\t" + grade);
        }
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Marks Of Ten Student :- "); //Taking the Input For 10 Students Marks
        int arr[] = new int[10];
        for(int i=0 ; i<10 ; i++)
        {
            arr[i]=in.nextInt(); //Taking input in Array
        }
        for(int i=0 ; i<10 ; i++) //Sorting Them
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
        display(arr); //Printing the Grades
        in.close();
    }
}
