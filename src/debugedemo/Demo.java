package debugedemo;

public class Demo 
{

	public static void main(String[] args) 
	{

		int a = 10;

		int b = 20;

		int c = a + b;

		System.out.println("sum is " + c);

		for (int i = 0; i < 4; i++) 
		{

			System.out.println("i am vicky " + i);
		}

		int result = multiply(4, 8);

		System.out.println("result is "+result);
		
		
		if(a==10) 
		{
			System.out.println("a is 10");
		}
		else 
		{
			System.out.println("a is not 10");
		}
		
		Utils.reminder(4, 8);
		
		
	}
	

	static int multiply(int x, int y) 
	{

		int mul = x * y;
		return mul;
	}
	

}
