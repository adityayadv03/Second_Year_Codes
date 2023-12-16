/*Author :- Aditya Yadav */
import java.util.*;
public class Question_9 //Program to implement 2D Array
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[2][2];
        int sum=0;
        System.out.print("Enter the Element in Array :- "); //Taking Input From User
        for(int i=0 ; i<2 ; i++)
        {
            for(int j=0 ; j<2 ; j++)
            {
                arr[i][j]=in.nextInt();
                sum+=arr[i][j]; //Adding it
            }
        }
        System.out.println("Sum of All Element :- "+sum); //Printing the Sum
        in.close();
    }
}
