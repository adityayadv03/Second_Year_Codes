package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_3;
/*Author :- Aditya Yadav */
class person
{
    String name;
    int age;
    person(String str,int year)
    {
        name=str;
        age=year;
    }
    void display()
    {
        System.out.println("Name :- "+name);
        System.out.println("Age :- "+age);
    }
}
public class Question_4 
{
    public static void main(String[] args)
    {
        person pr1 = new person("Aditya",19);
        pr1.display();
    }
}
