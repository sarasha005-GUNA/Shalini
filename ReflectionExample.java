package project;
import java.lang.reflect.*;
 class Data {
   String name;
   int age;void show()
   {
	   System.out.println("Name:"+name);
	   System.out.println("Age:"+age);
   }
 }
 class ReflectionExample{
	public static void main(String[] args) {
		Data s1=new Data();
		Class a=s1.getClass();
		System.out.println("Class Name:"+a.getName());
		System.out.println("\n Fields inside the object:");
		Field fields[]=a.getDeclaredFields();
		for(Field f:fields)
			{
			System.out.println(f.getName()+":"+f.getType().getSimpleName());
			}
		System.out.println("\n Methods inside the object:");
		Method methods[]=a.getDeclaredMethods();
		for(Method m:methods)
		{
			System.out.println(m.getName());
		}
	}
 }

