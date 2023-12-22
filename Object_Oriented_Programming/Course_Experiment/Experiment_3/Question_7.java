package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3;
/*Author :- Aditya Yadav */
public class Question_7 
{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=41 ; i<250 ; i++)
        {
            if(i%5==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of All the Divisible in Given Range is :- "+sum);
    }
}
