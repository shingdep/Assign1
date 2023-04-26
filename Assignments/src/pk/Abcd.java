//polymorphism overridden...//
package pk;

public class Abcd extends Abc 
{
  public void arithmatic(int a1,int a2)
  {
	  int c;
	  c=a1-a2;
	  System.out.println(" result is"+c);
  }
  public static void main(String[] args) 
  {
	  Abcd n=new Abcd();
	  n.arithmatic(22, 12);
}
}
