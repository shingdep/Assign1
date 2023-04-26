//(10+2)(10-2) prog//
package pk;

public class Calculation 
{
  public int sum(int a,int b)
  {
	  int c;
	  c=a+b;
	  System.out.println(" sumresult is"+c);
	  return c;
  }
  public int sub(int a1,int b1)
  {
	  int d;
	  d=a1-b1;
	  System.out.println(" subresult is"+d);
	  return d;
  }
  public void multiply(int x,int y)
  {
	  int e;
	  e=x*y;
	  System.out.println("Finalresult is"+e);
  }
  public static void main(String[] args) 
  {
	Calculation t=new Calculation();
	int sumresult=t.sum(12, 2);
	int subresult=t.sub(22, 12);
	t.multiply(subresult, sumresult);
}
}
