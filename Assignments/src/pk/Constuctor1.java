// constructor defaut + parameterized using this keyword 1st use in constructor//
package pk;

public class Constuctor1 
{
	  public Constuctor1()
	  {
		  this(26);
		  System.out.println(" default constructor");
	  }
	  public Constuctor1(int a)
	  {
		  System.out.println(" one paramrterized constructor");
	  }
	  public Constuctor1(int a,int b)
	  {
		  this(); // will call default & control will go to default con...//
		  System.out.println(" Two paramrterized constructor");
	  }
	  public static void main(String[] args) 
	  {
		Constuctor1 g=new Constuctor1(11,22); // call two parame...& control will go to 2 parame....//
	  }
	}
