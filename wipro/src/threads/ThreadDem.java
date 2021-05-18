package threads;


//using thread interface


class An extends Thread{
public void run() {
numbers();


}
void numbers() {
for(int i=0;i<10;i++) {
System.out.println(i);
}

}
}




public class ThreadDem{
public static void main(String[] args) {
An a=new An();
a.start();

}
}