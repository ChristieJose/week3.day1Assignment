package week3.day1;

public class Calculator {
	
	
	/*Classroom 3:
		Create class Calculator with below methods
		- 2 methods for add,      1 method with 2 int args , 1 method with 3 int args
		- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
		- 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
		- 2 methods to divide ,   1 method with 2 int args, 1 method with one double number and one int
		Create object for the Calculator class and execute all the methods*/
public int add(int a,int b)
{
	int sum=a+b;
	return sum;
}
public int add(int a,int b,int c)
{
	int sum=a+b+c;
	return sum;
}
public int multiply (int a,int b)
{
	int multiply=a*b;
	return multiply;
}
public int multiply ()
{
	int multiply=(int) (a*b);
	return multiply;
}
public double subtract (double a,double b)
{
	double subtract=a-b;
	return subtract;
}
public int subtract (int a,int b)
{
	int subtract=a-b;
	return subtract;
}
public int divide(int a,int b)
{
	int divide=a/b;
	return divide;
}
public int divide(int a,double b)
{
	int divide=(int) ((int) a/b);
	return divide;
}
public static void main(String[] args) {
	Calculator obj=new Calculator();
	int add=obj.add(10, 15);
	System.out.println("the sum of two numbers is " + add);
	int add1=obj.add(10, 10, 10);
	System.out.println("the sum of Three numbers is " + add1);
	int subtract=obj.subtract(100, 15);
	System.out.println("the Subtaraction of Two numbers is " + subtract);
	double subtract1=obj.subtract(100000, 1500);
	System.out.println("the Subtaraction of Two numbers is " + subtract1);
	int multiply=obj.multiply(100,500);
	System.out.println("the Multiplication of Two numbers is " + multiply);
	int multiply1=obj.multiply(100,1000000);
	System.out.println("the Multiplication of Two numbers int and double is " + multiply1);
	int divide=obj.divide( 1000,100);
	System.out.println("the Multiplication of Two numbers int and double is " + divide);
	int divide1=obj.divide( 1000000000,100);
	System.out.println("the Multiplication of Two numbers int and double is " + divide1);
	
	
	
	
	
}
}
