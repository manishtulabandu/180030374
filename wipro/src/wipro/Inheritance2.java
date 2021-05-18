package wipro;


/**Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.The other data members of 
the Employee class are annual salary (double), the year the employee started to work, 
and the national insurance number which is a String.Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
**/

public class Inheritance2 {
	public static void main(String args[])
	{
		Employee e=new Employee("Mani",156000,2016,"ugk65");
		e.print();
	}

}
class Person
{
	String name;
	Person(String j)
	{
		name=j;
	}
	String retname()
	{
		return name;
	}
}
class Employee extends Person
{
	String name="Mani";
	double annualSalary;
	int year;
	String insuranceNum;
	Employee(String na,double an,int ye,String in)
	{
		super(na);
		annualSalary=an;
		year=ye;
		insuranceNum=in;
	}
	//Person p=new Person();
	void print() {
		System.out.println(super.retname());
		System.out.println("ann sal ="+annualSalary+",year of joining ="+year+" , insuranceyear :- "+insuranceNum);
	}
	
	
}
