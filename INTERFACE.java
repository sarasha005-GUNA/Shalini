package project;

interface bob {
	void bobinterest();
}
interface icici
{
	void iciciinterest();
}
class person implements bob,icici
{
	public void bobinterest()
	{
		System.out.println("the bob innterest amount is"+(1000*0.07));
	}
	public void iciciinterest()
	{
		System.out.println("the icici interest amount is"+(1000*0.08));
	}
}
class INTERFACE{
	public static void main(String[] args) {
person a=new person();
a.bobinterest();
a.iciciinterest();
}

}
