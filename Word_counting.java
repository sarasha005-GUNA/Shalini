package project;

public class Word_counting {
	    public static void main(String[] args) {
	        String s = "shalini saravanan";
	        int count = 0;
	        for (char c : s.toCharArray()) {
	            if (c != ' ') {
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
	
}
