package project;
import java.util.Scanner;
class functiondemo
{
   public void sub(int x,int y)
   {
	   System.out.println("subtaction="+(x-y));
   }
}
class wo_re_wi_ar
{
	public static void main(String[] args) {
		functiondemo obj=new functiondemo();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.sub(a, b);
		
	}

}
