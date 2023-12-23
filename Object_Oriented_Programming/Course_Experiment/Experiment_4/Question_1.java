package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
class A //Class A Superclass
{
	int a=10;
	int b=20;
}
class B extends A //Class B Subclass for Class A
{
	int c=30;
	int d=40;
	void display()
	{
		System.out.println("The Value of a is :- "+super.a); //Accessing variable declare in Class A with help of Super Keyword
		System.out.println("The Value of b is :- "+super.b); //Accessing variable declare in Class A with help of Super Keyword
		System.out.println("The Value of c is :- "+c);
		System.out.println("The Value of d is :- "+d);
	}
}
public class Question_1 //Program to implement inheritance
{
	public static void main(String[]args)
	{
		B obj = new B(); //Creating Object of SubClass
		obj.display(); //Calling the Required Function
	}
}
