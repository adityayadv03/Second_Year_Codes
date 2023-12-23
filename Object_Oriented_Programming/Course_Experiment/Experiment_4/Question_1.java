package Second_Year_Codes.Object_Oriented_Programming.Course_Experiment.Experiment_4;
/*Author :- Aditya Yadav */
class A
{
	int a=10;
	int b=20;
}
class B extends A
{
	int c=30;
	int d=40;
	void display()
	{
		System.out.println("The Value of a is :- "+super.a);
		System.out.println("The Value of b is :- "+super.b);
		System.out.println("The Value of c is :- "+c);
		System.out.println("The Value of d is :- "+d);
	}
}
public class Question_1
{
	public static void main(String[]args)
	{
		B obj = new B();
		obj.display();
	}
}
