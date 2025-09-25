package project;

 class AMOUNT{
  private int minimumbalance=2500;
  public int getminimumbalance()
  {
	  return minimumbalance;
  }
 } 
 class getter
 {
	public static void main(String[] args) {
		AMOUNT bb=new AMOUNT();
		int min=bb.getminimumbalance();
		System.out.println(min);
	}

}
