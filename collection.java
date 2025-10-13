package project;

import java.util.ArrayList;

public class collection {

	public static void main(String[] args) {
		ArrayList<Integer>alist=new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		for(int i=1;i<=10;i++)
			alist.add(i);
		System.out.println(alist);
	}

}
