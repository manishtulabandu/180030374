package commandline;



import java.io.*;
import java.util.*;
public class Sum {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int sum=num1+num2;
	System.out.println("The sum of "+num1+ " and "+num2+" is "+sum);
}
}

