package JDBC;
import java.util.*;
public class data_structure {

	public static void main(String[] args) {
		Stack<String>stack=new Stack <>();
		stack.push("APPLE");
		stack.push("BANANA");
		stack.push("CHERRY");
		stack.push("DATES");
		System.out.println("stack:"+stack);
		String searchElement="CHERRY";
		int position=stack.search(searchElement);
		if(position!=-1)
		{
			System.out.println(searchElement+"found at position(from top):"+position);
		}else
		{
			System.out.println(searchElement+"not found in stack");
		}
	
	}

}
