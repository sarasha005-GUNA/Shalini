package project;
import java.io.*;
public class static_run_before {
	static
	{
      System.out.println("I will run before the jvm loads the main class");
	}
	static int count=0;
	{
		System.out.println	("I will run for each object creation");
		count++;
	}
	public static void main(String[] args) {
		static_run_before e=new static_run_before();	
		static_run_before e1=new static_run_before();
		System.out.println(count);
	}

}
