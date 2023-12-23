package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
class vec //Class Vehicle A SuperClass
{
	String model="Ford Mustang";
	int year=1995;
}
class car extends vec //SubClass One Extending SuperClass
{
	int numdoors; //Extra Variable For Require Subclass
	car(int n)
	{
		numdoors=n;
	}
	void display() //Function to Display All the Details
	{
		System.out.println("The Models of The Vechicles is :- "+super.model);
		System.out.println("The Year of Vechicles Manufacture is :- "+super.year);
		System.out.println("The Number of Doors in car is :- "+numdoors);
	}
}
class motor extends vec //SubClass Two Extending SuperClass
{
	String enginetype; //Extra Variable For Require Subclass
	motor(String st)
	{
		enginetype=st;
	}
	void display() //Function to Display All the Details
	{
		System.out.println("The Models of The Vechicles is :- "+super.model);
		System.out.println("The Year of Vechicles Manufacture is :- "+super.year);
		System.out.println("The EngineType is :- "+enginetype);
	}
}
public class Question_2 //Program to Implment Inheritance For Require Question
{
	public static void main(String[]args)
	{
		car obj1 = new car(4); //Object One For SubClass One
		motor obj2 = new motor("Disel Cycle Engine"); //Object Two For SubClass Two
		obj1.display(); //Calling the Require Function
		obj2.display(); //Calling the Require Function
	}
}
