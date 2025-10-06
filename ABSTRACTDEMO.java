package project;
import java.io.*;
abstract class member {
      abstract void welcomemsg();
      void display()

{
	System.out.println("welcome all");
}
}
class mam extends member
{
	void welcomemsg()
	{
	 System.out.println("hello student");
	}
}
	class teacher extends member
	{
		void welcomemsg()
		{
			System.out.println("welcome teacher");	
		}
	}
class ABSTRACTDEMO{
public static void main(String[] args) {
		mam s1=new mam();
		s1.display();
		s1.welcomemsg();
	}
	}



