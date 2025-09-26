package project;
 class mathoperation {
	 static int multiply(int a,int b)
	 {
		 return a*b;
	 }
	 static int multiply(double x,double y)
	 {
		 return x*y;
	 }
	 static int multiply(int r)
		 return r*r;
	 }
 }
public class polymorphism {
	public static void main(String[] args) {
		System.out.println("\nmulti of 2 integers="+mathoperation.multiply(25,10));
		System.out.println("\nmulti of 2 doubles="+mathoperation.multiply(2.5357,8.5786));
		System.out.println("\nmulti of same values="+mathoperation.multiply(6));
		
	}

}
