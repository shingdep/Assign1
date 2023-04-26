// child class constructor using super and this keyw used//
package pk;

public class Swift extends Maruti
{
	public Swift()
	  {
		  System.out.println(" child default constructor");
	  }
	public Swift(int a)
	  {
		  super(333);
		  System.out.println(" child one parameterized constructor");
	  }
	public Swift(int a, int b)
	  {
		  System.out.println(" child two parameterized  constructor");
	  }
	public Swift(int a,int b,int c)
	  {
		  this(345);
		  System.out.println(" child three parameterized constructor");
	  }
	public static void main(String[] args) 
	{
		Swift b=new Swift(77,99,53);
		
	}
}
