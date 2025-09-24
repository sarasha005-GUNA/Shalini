package project;
class functiondemos {
 public int mul()
 {
	 int a=123;
	 int b=10;
	 return a*b;
   }
 }
public class wi_re_wo_ar{
	public static void main(String[] args) {
		functiondemos obj=new functiondemos();
		int x=obj.mul();
		System.out.println(x);
	}

}
