package project;

class cycle {
    public void display()
    {
    	System.out.println("I AM A CYCLE..");
    }
    }
    class anonymous{
	public static void main(String[] args) {
		cycle c=new cycle()
	{
		public void display()     
	{
				System.out.println("I AM A TRICYCLE..");
	}};
		c.display();
	}
}
