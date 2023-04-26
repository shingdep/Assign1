//// Super keyword to call parent method/ can call parent varible also//
package pk;

public class Second extends First
{
  public void Method3()
  {
	  super.a=123;
	  super.Method1();
	  super.Method2();
	  System.out.println(" child method");
  }
  public static void main(String[] args) 
  {
	Second g=new Second();
	g.Method3();
}
}
