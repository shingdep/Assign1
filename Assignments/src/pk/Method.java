// constructor using second use of this in method//
package pk;

public class Method 
{
  public void M1()
  {
	  System.out.println(" i m method1");
  }
  public void M2()
  {
	  System.out.println(" i m method2");
  }
  public void M3()
  {
	  this.M1();
	  System.out.println(" i m method3");
	  this.M2();
  }
  public static void main(String[] args) 
  {
	Method b=new Method();
	b.M3(); // control will go to m3//
}
}
