package project;
import java.util.io.*;
public class PERFECT {

	public static void main(String[] args) {
		int n=6,sum=0;
		int i=1;
		while(i<=n/2)
		{
			sum=sum+i;
		}
		i++;
 if(sum==n)
		
	{
		System.out.println("perfect number");
	}
	else
	{
		System.out.println("not a perfect number");
    }
}
}
