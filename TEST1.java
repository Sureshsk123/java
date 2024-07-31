class Suresh1
{
	int Num;
	int Sum;
	
	Suresh1(int n)
	{
	Num=n;
	}
	void operation()
	{
	for(int i=1;i<=Num;i++)
		{
			Sum += i;
		}
	System.out.println("sum of the series =" +Sum);
	}
}
class Suresh1Test
{
	public static void main (String arg[])
	{
	Suresh1 mynum = new Suresh1(5);
	mynum.operation();
	}
}