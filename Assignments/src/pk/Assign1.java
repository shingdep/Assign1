//Assignment1

//Output should be in the below sequence(using this and super keyword)

//Parent 3 parameterized constructor
//Parent Default constructor
//Parent 1 parameterized constructor
//Parent 2 parameterized constructor
//Child 2 parameterized constructor
//Child default consrructor
//Child 3 parameterized construcotr
//Child 1 parmerterized constructor
package pk;

public class Assign1 
{
  public Assign1()
  {
	  this(1,2,3);
	  System.out.println(" parent default constructor");
  }
  public Assign1(int a)
  {
	  this();
	  System.out.println(" parent one parameterized constructor");
  }
  public Assign1(int a, int b)
  {
	  this(1);
	  System.out.println(" parent two parameterized constructor");
  }
  public Assign1(int a,int b,int c)
  {
	  System.out.println(" parent  three parameterized constructor");
  }
  public static void main(String[] args) 
  {
	Assign1 u=new Assign1(1);
}
}
