package threads;

//Runnable method



class A implements Runnable{
public void run() {
numbers();


}
void numbers() {
for(int i=0;i<10;i++) {
System.out.println(i);
}

}
}




public class ThreadDemo{
public static void main(String[] args) {
A a=new A();
Thread t=new Thread(a);// to make an obj into thread

t.start();

}
}
