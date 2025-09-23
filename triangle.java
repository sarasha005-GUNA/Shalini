package project;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base:");
		 int base=sc.nextInt();
		System.out.println("Enter height:");
		 int height=sc.nextInt();
		double area=0.5*base*height;
		System.out.println("Area:"+area);
		sc.close();

	}

}
