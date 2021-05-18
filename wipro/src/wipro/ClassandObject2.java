package wipro;

/**Create a new class called Calculator with the following methods: 
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.**/

class Calculator
{
	static double powerInt(int num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
}
public class ClassandObject2 {
	public static void main(String args[])
	{
		Calculator c=new Calculator();
		System.out.println(c.powerInt(10,5));
		System.out.println(c.powerDouble(2.456,3));
	}

}