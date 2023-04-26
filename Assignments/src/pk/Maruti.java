// Parent class constructor using super and this keyw used//
package pk;

public class Maruti 
{
	public Maruti()
	  {
		  System.out.println(" parent default constructor");
	  }
	public Maruti(int a)
	  {
		  this(3,44);
		  System.out.println("Parent one parameterized constructor");
	  }
	public Maruti(int a,int b)
	  {
		  System.out.println(" Parent two parameterized constructor");
	  }
	public Maruti(int a,int b,int c)
	  {
		  System.out.println(" Parent three parameterized constructor");
	  }

}
