// single level inheritance child class Father+son//
package pk;

public class Harish extends Maya
{
  public void Method2()
  {
	  System.out.println(" child class 1");
  }
  public void Method3()
  {
	  System.out.println(" child class 2");
  }
  public static void main(String[] args) 
  {
	Harish b=new Harish();
	b.Method1();
	b.Method2();
	b.a=23;
	System.out.println(b.a);
}
}
