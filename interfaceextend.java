package project;

interface vehicle {
	void start();
}
interface car extends vehicle
{
	void moving();
}
class BMW implements car
{
	public void start()
	{
		System.out.println("CAR STARTED..");
	}
	public void moving()
	{
		System.out.println("CAR MOVING..");
	}
}
class interfaceextend{
	public static void main(String[] args) {
		BMW mycar=new BMW();
		mycar.start();
		mycar.moving();
	}

}
