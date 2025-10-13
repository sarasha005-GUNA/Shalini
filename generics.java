package project;

import java.util.ArrayList;

public class generics {

	public static void main(String[] args) {
		ArrayList<String>alist=new ArrayList<String>();
		alist.add("ram");
		alist.add("kumar");
		
		for(String a:alist)
		{
			System.out.println(alist);
			alist.remove(5);
			System.out.println(alist);
			alist.clear();
			System.out.println(alist);
		}
	}}


