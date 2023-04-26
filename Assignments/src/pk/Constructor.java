// Constructor default & parameerized//
package pk;

public class Constructor 
{
  public Constructor()
  {
	  System.out.println(" default constructor");
  }
  public Constructor(int a)
  {
	  System.out.println(" one paramrterized constructor");
  }
  public Constructor(int a,int b)
  {
	  System.out.println(" Two paramrterized constructor");
  }
  public static void main(String[] args) 
  {
	Constructor g=new Constructor(1);
	Constructor g1=new Constructor();
	Constructor g2=new Constructor(11,12);
  }
}
