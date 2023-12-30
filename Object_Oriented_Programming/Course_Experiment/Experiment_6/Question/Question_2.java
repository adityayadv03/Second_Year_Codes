package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_6.Question;
/*Author :- Aditya Yadav */
import Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_6.Package.Account;
public class Question_2
{
    public static void main(String[] args)
    {
        Account obj = new Account(10000);
        System.out.println("The Balance in the Account is :- "+obj.display_balance());
    }
}
