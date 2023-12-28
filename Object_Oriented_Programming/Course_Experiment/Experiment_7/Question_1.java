package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_7;
/*Author :- Aditya Yadav */
import java.util.*;
class Record
{
    String name;
    int roll;
    public Record(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    void display()
    {
        System.out.println("Name :- "+name);
        System.out.println("Roll Number :- "+roll);
    }
}
public class Question_1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number Of Students :- ");
        int n=in.nextInt();
        Record arr[] = new Record[n];
        String na;
        int r;
        for(int i=0 ; i<n ; i++)
        {
            System.out.print("Enter Name :- ");
            na=in.nextLine();
            na=in.nextLine();
            System.out.print("Enter Roll Number :- ");
            r=in.nextInt();
            arr[i]=new Record(na,r);
        }
        try
        {
            System.out.print("Enter the Number Of Student To View Details :- ");
            int a=in.nextInt();
            arr[a-1].display();
        }
        catch(Exception e)
        {
            System.out.println("Error :- "+e.getMessage());
        }
        in.close();
    }
}
