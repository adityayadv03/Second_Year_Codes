package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_7;
/*Author :- Aditya Yadav */
import java.util.*;
class Record //Class to hold the Student details and require Function
{
    String name; //Variable to Store Name
    int roll; //Variable to Store Roll Number
    public Record(String name,int roll) //Constructor to assign the details
    {
        this.name=name;
        this.roll=roll;
    }
    void display() //Function to display the details
    {
        System.out.println("Name :- "+name);
        System.out.println("Roll Number :- "+roll);
    }
}
public class Question_1 //Program to Handle exception Cause During accessing the details of Students(Generally ArrayOutOfBoundException)
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number Of Students :- "); //Taking the Number of Students from the User
        int n=in.nextInt(); 
        Record arr[] = new Record[n]; //Creating the array of Object to store the details of each Students
        String na; //Variable to Store Name
        int r; //Variable to Store Roll Number
        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Enter Name :- "); //Taking the Name 
            na=in.nextLine(); //Used this statement two time as it gets ignore if we write its onces
            na=in.nextLine();
            System.out.print("Enter Roll Number :- "); //Taking the Roll Number
            r=in.nextInt();
            arr[i]=new Record(na,r); //Intizialising the object with the name and roll number
        }
        try
        {
            System.out.print("Enter the Number Of Student To View Details :- "); //Asking the Number of Students to display the details
            int a=in.nextInt();
            arr[a-1].display(); //Calling the display function with a-1 as converting the position to index
        }
        catch(Exception e) //Catching the Exception Caused
        {
            System.out.println("Error :- "+e.getMessage()); //Printing the Error Using the getMessage Function
        }
        in.close();
    }
}
