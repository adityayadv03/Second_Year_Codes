package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
class vec
{
	String model="Ford Mustang";
	int year=1995;
}
class car extends vec
{
	int numdoors;
	car(int n)
	{
		numdoors=n;
	}
	void display()
	{
		System.out.println("The Models of The Vechicles is :- "+super.model);
		System.out.println("The Year of Vechicles Manufacture is :- "+super.year);
		System.out.println("The Number of Doors in car is :- "+numdoors);
	}
}
class motor extends vec
{
	String enginetype;
	motor(String st)
	{
		enginetype=st;
	}
	void display()
	{
		System.out.println("The Models of The Vechicles is :- "+super.model);
		System.out.println("The Year of Vechicles Manufacture is :- "+super.year);
		System.out.println("The EngineType is :- "+enginetype);
	}
}
public class Question_2
{
	public static void main(String[]args)
	{
		car obj1 = new car(4);
		motor obj2 = new motor("Disel Cycle Engine");
		obj1.display();
		obj2.display();
	}
}
