package project;

public class armstrong {

	public static void main(String[] args) {
int n=153,arm=0;
int temp=n;
while (n!=0)
{
	int a=n%10;
	arm=arm+(a*a*a);
	n=n/10;
}
if(temp==arm)
{
	System.out.println("armstrong");
}else
	{
	System.out.println("not amstrong");	
	}
	}
}
