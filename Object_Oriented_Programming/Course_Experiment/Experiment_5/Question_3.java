package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_5;
/*Author :- Aditya Yadav */
interface constant //Interface to Implement
{
    double pi=3.14;
    void ar(int r);
}
class Area implements constant //Class Implementing the Interface
{
    public void ar(int r) //Defining the Function declare in interface
    {
        float a=(float)(pi*r*r); //Calculating the Area
        System.out.println("The Radius Of Circle is :- "+a); //Printing the Calculated Area
    }
}
public class Question_3
{
    public static void main(String[] args)
    {
        Area obj = new Area(); //Creating the object of the Class
        obj.ar(7); //Calling the function for calculating area
    }
}
