//inheritance multi_son//
package pk;

public class Sonu extends Hari
{
	public void Method3()
	  {
		  System.out.println("i m child");
	  }
	public static void main(String[] args) 
	{
		Sonu v=new Sonu();
		v.Method1();
		v.Method2();
		v.Method3();
	}
}
