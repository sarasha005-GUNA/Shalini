package project;

abstract class parent {
	abstract void repay();
	void getloan()
	{
		System.out.println("GETTING LOAN");
	}
}
class daugter extends parent
{
	void repay()
	{
		System.out.println("I WILL PAY BEHALF OF MY FATHER");
	}
}
class absdemo{
	public static void main(String[] args) {
		daugter d=new daugter();
		d.getloan();
		d.repay();
	}

}
