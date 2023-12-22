package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3;
/*Author :- Aditya Yadav */
public class Question_7 //Program to Find Sum of All Number Deivsible by 5 In Range 40 to 250
{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=41 ; i<250 ; i++) //Running The Loop In Given Range
        {
            if(i%5==0) //If the Number is Divisible Then Adding it in the Variable sum
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of All the Divisible in Given Range is :- "+sum); //Printing Their Sum
    }
}
