package project;
 class finalize {
		  public void finalise()
		  {
		  System.out.println("finalize method called before object is destroyed");
		  }
		  public static void main(String[] args) {
	finalize object=new finalize();
	object=null;
	System.gc();
	System.out.println("main method execution");
		
	}

}
