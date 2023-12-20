package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3;
/*Author :- Aditya Yadav */
class person
{
    String name;
    int age;
    person(String str,int year) //Constructor
    {
        name=str;
        age=year;
    }
    void display() //Display Function
    {
        System.out.println("Name :- "+name);
        System.out.println("Age :- "+age);
    }
}
public class Question_4 //Program to Implement Class and Objects
{
    public static void main(String[] args)
    {
        person pr1 = new person("Aditya",19); //Object Creation of Class person
        pr1.display();
    }
}
