package project;

public class fascinating {

	public static void main(String[] args) {
		int n=192;
		if(n<100)
		{
			System.out.println("not fascinating number");
			return;
		}
int n1=n*2;
int n3=n*3;
//String a=String.valueof(n)+String.valueof(n1)+String.valueof(n3);
String a=""+n+(n*2)+(n*3);
System.out.println(a);
if(a.length()!=9)
{
	System.out.println("not fascinating number");
	return;
}
boolean b=true;
for(char c='1';c<='9';c++)
{
	if(a.indexOf(c)==-1)
	{
		b=false;
		break;
	}
	}
if(b==true)
{
	System.out.println("yes fascinating");
}
else
{
	System.out.println("not fascinating number");
       }
	}
}
