package project;
import java.io.*;
class Dg1 implements Serializable
{
transient int i=10;
transient int j=20;
}

class TRANSIENT
{
public static void main(String args[])throws Exception
{
Dg1 d1=new Dg1();

FileOutputStream fos=new FileOutputStream("abc.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(d1);

FileInputStream fis=new FileInputStream("abc.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
Dg1 d2=(Dg1)ois.readObject();

System.out.println(d2.i+"---------"+d2.j);

}
}