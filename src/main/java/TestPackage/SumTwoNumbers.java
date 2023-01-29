package TestPackage;

public class SumTwoNumbers {

	public static void main(String[] args) 
	{
		int a =10;
		int b =20;
		System.out.println("sum of two numbers:"+ (a+b));
		
	    //Test two numbers are same or greater or smaller
		
		if(a>b)
		{
			System.out.println(a +"is bigger than"+ b);
		}
		else if (a<b)
		{
			System.out.println(a + "is lesser than" + b);
		}
		else
		{
			System.out.println("Both are equal");
		}

	}

}
