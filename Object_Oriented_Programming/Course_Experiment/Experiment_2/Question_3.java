/*Author :- Aditya Yadav */
import java.util.*;
public class Question_3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        System.out.print("Enter Five Element :- ");
        for(int i=0 ; i<5 ; i++)
        {
            arr[i]=in.nextInt();
            sum=sum+arr[i];
        }
        float avg=sum/5;
        System.out.println("The Average of the Given Number is :- "+avg);
        in.close();
    }
}
