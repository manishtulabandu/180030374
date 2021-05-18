package serilizability;




import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class Employeee implements Serializable{
int empno;
String empname,email;
public Employeee(int empno, String empname, String email) {

this.empno = empno;
this.empname = empname;
this.email = email;
}
@Override
public String toString() {
return "Employeee [empno=" + empno + ", empname=" + empname + ", email=" + email + "]";
}

}
public class FileDemo{
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
/*writing our employee object into a.txt == to check print(e) */
Employeee e=new Employeee(101,"kk","k@c.c");
FileOutputStream fo=new FileOutputStream("a.txt");
ObjectOutputStream oo=new ObjectOutputStream(fo);
oo.writeObject(e);

//reading our object from a.txt to employee referenced object e1
FileInputStream fi=new FileInputStream("a.txt");
ObjectInputStream oi=new ObjectInputStream(fi);
Employeee e1=(Employeee) oi.readObject();
System.out.println(e1);

// oo.writeObject(e);
oo.close();
fo.close();






}
}