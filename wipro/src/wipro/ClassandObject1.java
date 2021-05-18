package wipro;

//Create a class Box that uses a parameterized constructor to initialize
//the dimensions of a box.The dimensions of the Box are width, height, depth.
//The class should have a method that can return the volume of the box. 
//Create an object of the Box class and test the functionalities.
class Box {
	int width,height,depth;
	public Box(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		this.width=i;
		this.height=j;
		this.depth=k;
		
	}
	
	int volume()
	{
		return width*height*depth;
	}

}
public class ClassandObject1
{
	public static void main(String args[])
	{
		Box n=new Box(10,20,50);
		System.out.println(n.volume());
	}
}
