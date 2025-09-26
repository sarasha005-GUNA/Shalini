package project;

//import java.util.Scanner;


public class sorting {

	public static void main(String[] args) {
		int[] a={3,5,7,8};
		int even=0,odd=0;
for(int i:a){
		if(i%2==0){
			even+=i;
			
		}
		else{
			odd+=i;		
		}
	}
	System.out.println("even"+even);
	System.out.println("odd"+odd);
	
	int d=even-odd;
	System.out.println("difference is:"+d);
	if(d<0)
		d=-d;
	}
	}
