class Add 
{
	int a;
	int b;
	int c;	
	void get()
	{
		a=10;
		b=20;
	}
	void cal()
	{
		c=a+b;
	}
	void disp()
	{
		System.out.println("output "+c);
	}
}
class AddTest
{
	public static void main(String arg[])
	{
		Add obj=new Add();
		obj.get ();
		obj.cal ();
		obj.disp ();
	}
}