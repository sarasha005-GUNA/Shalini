package project;
import java.util.Scanner;
public class restaurant {

	public static void main(String[] args) {
	 System.out.println(" 1.coffee rs.15");
	    System.out.println( "2.tea rs.10");
	    System.out.println( "3.coldcoffee rs.25");
	    System.out.println( "4.milkshake rs.50");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your choice:");
	    int num =sc.nextInt();
	    System.out.println("enter your quantity:");
	    int b=sc.nextInt();
	     switch(num)
	    {
	    case 1:
	    System.out.println("you have selected coffee");
	     int c=b*15;
	     System.out.println("your amount is:"+c);
	     break;
	     case 2:
		 System.out.println("you have selected tea");
		 int d=b*10;
		 System.out.println("your amount is:"+d);
		 break;
		case 3:
		 System.out.println("you have selected coldcoffee");
		int e=b*25;
		 System.out.println("your amount is"+e);
		 break;
		case 4:
		   System.out.println("you have selected milkshake");
			int f=b*50;
			System.out.println("ypur amount is"+f);
		    break;
	    }
	}

}
