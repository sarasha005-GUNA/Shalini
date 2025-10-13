package project;
import java.util.*;
public class stream2 {

	public static void main(String[] args) {
		int arr[]={2,8,5,6,3};
		Arrays.stream(arr).sorted().foreach(System.out::println);

	}

}
