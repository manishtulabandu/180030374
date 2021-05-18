package wipro;

/**Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.**/

class Patient
{
	String patientName;
	double height,weigth;
	Patient(String k,int i,int j)
	{
		patientName=k;
		height=i;
		weigth=j;
		
	}
	double computeBMI()
	{
		double z=weigth  / height*height;
		return z;
	}
	
}
public class ClassandObject3 {
	public static void main(String args[])
	{
		Patient p=new Patient("one",10,30);
		Patient p1=new Patient("two",20,50);
		System.out.println(p.computeBMI());
		System.out.println(p1.computeBMI());
	}

}
