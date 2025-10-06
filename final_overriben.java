package project;

 class machine {
     final void run()
     {
    	 System.out.println("MACHINE IS RUNNING..");
     }
 }
 class bike extends machine
 {
 void run()
	 {
		 System.out.println("BIKE IS RUNNING..");	 
	 }
 }
 class final_overriben{
	public static void main(String[] args) {
		bike obj=new bike();
		obj.run();
	}

}
