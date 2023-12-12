/*Author :- Aditya Yadav */
import java.util.*;
public class Question_3 //Program to find the Average of 5 Number
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        System.out.print("Enter Five Element :- "); //Taking Input 
        for(int i=0 ; i<5 ; i++)
        {
            arr[i]=in.nextInt();
            sum=sum+arr[i]; //Calculating the Sum for average
        }
        float avg=sum/5; //Calculating the Average
        System.out.println("The Average of the Given Number is :- "+avg); //Printing the average
        in.close();
    }
}
