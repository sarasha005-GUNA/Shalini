package project;

public class intersect {

	public static void main(String[] args) {
		int a[]={1,3,2,5,3};
		int b[]={3,2,3};
		for(int i=0;i<a.length;i++)
		{
	      for(int j=0;j<b.length;j++)
	      {
	    	  if(a[i]==b[j])
	    {
	    		  System.out.println(b[j]);
	    	   a[i]=-1;
	    	   break;
	      }

          }
		}
	}
}
