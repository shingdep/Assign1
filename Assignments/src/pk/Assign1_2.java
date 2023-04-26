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

public class Assign1_2 extends Assign1
{
	public Assign1_2()
	{
		this(1,2);
		System.out.println(" child default constructor");
	}
	public Assign1_2(int a)
	{
		this(1,2,3);
		System.out.println(" Child 1 parmerterized constructor");
	}
	public Assign1_2(int a, int b)
	{
		super(1,2);
		System.out.println(" Child 2 parmerterized constructor");
	}
	public Assign1_2(int a, int b, int c)
	{
		this();
		System.out.println(" Child 3 parmerterized constructor");
	}
	public static void main(String[] args)
	{
		Assign1_2 b=new Assign1_2(2);
	}
}
