package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_6.Package; //Setting the package with the help of package keyword
/*Author :- Aditya Yadav */
public class Account //Class To Created in Package Folder to implement package in Java
{
    int balance;
    public Account(int balance) //A Constructor To set the Value of balance to the local variable
    {
        this.balance=balance;
    }
    public int display_balance() //Function to display or to know the value of Balance of Account
    {
        return balance;
    }
}
