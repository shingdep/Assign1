// 4 pillers prac prog//
package pk;

public class Student 
{
  int a=67;
  public void bc()
  {
	  System.out.println("welcome...");
  }
	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.bc(); //call the method//
		obj.a=58;
		System.out.println(obj.a);
	}

}
