package wipro;

/**Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author details)**/
class Author
{
	String name,email;
	char gender;
	Author(String a,String b,char c)
	{
		name=a;
		email=b;
		gender=c;}}
class Book
{
 String name;
 Author a=new Author("mani","mani@gmail.com",'M');
 double price;
 int qtyinStock;
 Book(String n,double p,int z)
 {
	 name=n;
	 price=p;
	 qtyinStock=z;
 }
 String autname()
 {
	 return a.name;
 }
 String autemail()
 {
	 return a.email;
 }
 char gender()
 {
	 return a.gender;
 }
}
public class EncapsulationandAbstraction1 {
	public static void main(String args[])
	{
		Book b=new Book("love and passion",200,25);
		System.out.println("auth name ="+b.autname()+" ,auth email ="+b.autemail()+" ,auth gen= "+b.gender());
		System.out.println("book details :-");
		System.out.println(" book name= "+b.name+" ,book price ="+b.price + " ,quantity ="+b.qtyinStock);
	}

}
