package project;
import java.util.Scanner;
public class nila 
{

	public static void main(String[] args) {
		int amount=0;
		int a=0;
		for(int i=1;i<=4;i++){
		System.out.println("Simple banking System");
	    System.out.println("1.deposit");
	    System.out.println( "2.withdraw");
	    System.out.println( "3.checkbalance");
	    System.out.println( "4.exit");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("choose an option:");
	    int num =sc.nextInt();
	    switch(num){
	    case 1:
	    	
	    	System.out.println("Enter the amount to deposit:");
	        amount=sc.nextInt();
	    	System.out.println("deposited:"+amount);
	    	continue;
	    case 2:
	    	
	    	System.out.println("Enter the amount to withdraw:");
	        a=sc.nextInt();
	    	System.out.println("withdrawn:"+a);
	    	continue;
	    case 3:
	    	
	    	//System.out.println("checkbalance:");
	        int c=amount-a;
	    	System.out.println("current balance:"+c );
	    	continue;
	    case 4:
	    	
	    	System.out.println("exiting the application");
	        break;
	    }}
	}

}

	