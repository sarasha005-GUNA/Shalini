package project;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		int arr[] =new int[100];
		int size;
		
		System.out.println("enter the size");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		System.out.println("enter the array values");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
			for(int i=0;i<size;i+=2){
				System.out.println(arr[i]+"");
			}
			System.out.println();
			for(int i=size-1;i>=0;i-=2){
				System.out.print(arr[i]+"");
				
			}
		}

}