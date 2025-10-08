package project;

import java.util.Scanner;

class vehicles{
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NO OF WHEELS:");
		int w=sc.nextInt();
		System.out.println("ENTER THE NO OF VEHICLES:");
		int v=sc.nextInt();
		for(int i=1;i<=w;i++){
			for(int j=1;j<=w;j++){
				if((i*4)+(j*2)==w){
				if(i+j==v){
					System.out.println("no of two wheeler  "+i +" and "+"no of four wheeler  "+j);
					}
		
				
			}
      }
      }
}
}
