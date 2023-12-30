package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_6.Question;
/*Author :- Aditya Yadav */
import Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_6.Package.Account; //Importing the class Account define in Folder Package
public class Question_2 //Program to access the balance of any customer from the account class present in another package
{
    public static void main(String[] args)
    {
        Account obj = new Account(10000); //Creating the Object of the Account Class to access its data members and member Functions
        System.out.println("The Balance in the Account is :- "+obj.display_balance()); //Displaying the balance with the help of display_Function in Class Account
    }
}
