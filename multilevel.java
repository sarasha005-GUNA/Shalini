package project;

 class grandfather {
       void land()
       {
    	   System.out.println("5 acres of land");
         }
       }
 class father extends grandfather
 {
	 void house()
	 {
		 System.out.println("have an 2bhk house");
	 }
 }
 class son extends father 
 {void car()
	 {
	 System.out.println("have own audi car");
	 }
 }
 class multilevel
 
 {
	public static void main(String[] args) {
		son obj=new son();
		obj.car();
		obj.house();
		obj.land();

	}

}
