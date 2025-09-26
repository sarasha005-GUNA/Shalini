package project;
import java.io.*;
public class LEFTSHIFT {

	public static void main(String[] args) {
	int arr[]={10,20,30,40,50};
	System.out.println("before shift=");
	for (int j=0;j<arr.length;j++)
	{
		System.out.println(arr[j]+"");
	}
	int temp=arr[0];
	int i=0;
	while(i<arr.length-1)
	{
		arr[i]=arr[i+1];
		i++;
	}
	arr[i]=temp;
	System.out.println("after shifting:");
	for(i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+"");
	}
	}

}
