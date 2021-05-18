package ObjectCopying;

class Aa{
int i,j;
}
public class SwallowCopying {
public static void main(String[] args) {
//shallow copy
Aa o=new Aa();
o.i=5;
o.j=6;
Aa h=new Aa();
h=o;
h.i=h.i+2;
System.out.println(h.i+" "+o.i);

}
}
