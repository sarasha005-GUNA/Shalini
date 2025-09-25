package project;

 class BOOK{
	 private int minimumbalance=2500;
	 public void setminimumbalance(int value)
	 {
		 this.minimumbalance=value;
		 System.out.println(minimumbalance);
	 }
 }
 class setter
 {
	 
	public static void main(String[] args) {
		BOOK bb=new BOOK();
		bb.setminimumbalance(10000);
	}
}

