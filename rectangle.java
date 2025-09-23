package project;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length:");
		a=sc.nextInt();
		System.out.println("enter breadth:");
		b=sc.nextInt();
		double area=a*b;
		System.out.println("area:"+area);
		sc.close();
	}

}
