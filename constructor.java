package project;
 class box {
	int length,breadth;
	box(int x,int y)
	{
		length=x;
		breadth=y;
	}
	int area()
	{
		return length*breadth;
	}
 }
public class constructor{
	public static void main(String[] args) {
		box b1=new box(3,6);
		System.out.println(b1.area());
	}

}
