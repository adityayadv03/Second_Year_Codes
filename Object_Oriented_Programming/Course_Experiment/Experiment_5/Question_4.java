package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_5;
/*Author :- Aditya Yadav */
interface two //Creating the interface to declare two function div and mod
{
    void div(int a,int b); //function to calculate division between two number
    void mod(int a,int b); //function to calculate modulus between two number
}
class Ride implements two //Class to implementing the interface
{
    public void div(int a,int b) //Function defination to calculate division
    {
        float c=(float)(a/b); //Calculating the division
        System.out.println("The Division of "+a+" "+b+" is :- "+c); //Printing the Division
    }
    public void mod(int a,int b) //Function defination to calculate modulus
    {
        int c=a%b; //Calculating the Modulus
        System.out.println("The Modulus of "+a+" "+b+" is :- "+c); //Printing the Modulus
    }
}
public class Question_4
{
    public static void main(String[] args)
    {
        Ride obj = new Ride(); // Creating the Object of the Class
        obj.div(3,2); //Calling the Required Functions
        obj.mod(3,2);
    }
}
