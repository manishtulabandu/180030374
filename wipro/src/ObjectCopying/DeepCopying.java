package ObjectCopying;

class A{
int i,j;
}
public class DeepCopying {
public static void main(String[] args) {
//deep copy
A o=new A();
o.i=5;
o.j=6;
A h=new A();
h.i=o.i;
h.j=o.j;
h.i=h.i+1;
System.out.println(o.i+" "+h.i);

}
}


//by changing the new object variable values
//original object data was not changing

//references of both objects are different here