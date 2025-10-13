package project;

import java.util.ArrayList;

public class common_value {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(2);
		a.add(6);
		a.add(1);
		ArrayList<Integer>b=new ArrayList<>();
		b.add(2);
		b.add(3);
		b.add(4);
		a.retainAll(b);
		System.out.println(a);
	}
	}


