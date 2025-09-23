package project;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		a=sc.nextInt();
        System.out.println("enter second number:");
        b=sc.nextInt();
        c=a+b;
        System.out.println("sum:"+c);
        double average=c/2.0;
        System.out.println("average:"+average);
        sc.close();
        
		

	}

}
