package project;

class User
{
    String name;
    int age;
    User(String n,int a)
    {
        this.name=n;
        this.age=a;
    }
    public void display()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }
}
  class pencil extends User
{
    String companyname;
   pencil(String n,int a,String c)
    {
        super(n,a);
        this.companyname=c;
    }
    public void display()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Company Name="+companyname);
    }
}  
public class mainprogrammer
{
    public static void main(String args[])
    {
        pencil obj=new pencil("Ram",22,"Technologies");
        obj.display();
    }
}