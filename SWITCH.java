package project;
import java.io.*;
public class SWITCH {

	public static void main(String[] args) {
		String day="MON";
		int num=switch(day){
		case "MON","TUE","WED","THU","FRI"->1;
		case "SAT","SUN"->0;
		default->-1;
		};
		System.out.println(num);
	}

}
