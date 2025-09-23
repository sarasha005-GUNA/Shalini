package project;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		float salary,gross;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary:");
	    salary=sc.nextFloat();
	    float hra=0.4f*salary;
	    float da=0.2f*salary;
	    System.out.println("gross:"+(hra+da+salary));
	    sc.close();
	}

}
