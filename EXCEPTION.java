package project;
 class Box extends Thread{
		 public void run()
		 {
			 try
			 {
				 for(int i=1;i<=5;i++)
				 {
					 Thread:sleep(2000);
				 System.out.println("update database");
				 }
			 }
			 catch(InterruptedException e){}
		           }
	 }
	class Box1 extends Thread
	{
		public void run()
		{
			try
			{
				for(int i=1;i<=5;i++)
				{
					Thread.sleep(2000);
					System.out.println(i);
				}
			}
			catch(InterruptedException e){}
			}
	 }
	class EXCEPTION{
	public static void main(String[] args) throws InterruptedException {
		Box b=new Box();
		b.start();
		Box1 b1=new Box1();
		b1.start();
		b.join();
		b1.join();
		System.out.println("i am working by main Thread.."); 
	}

}
