
import java.util.Scanner;

class A 
{
	public static void main(String[] args) 
	{
		int age;
		Scanner sc  = new Scanner(System.in);
		age=sc.nextInt();
		System.out.println("pls entre one number");
		if (age<18)
		{
			System.out.println("not eligible for voting");
		}
		else
		{
			System.out.println("eligible for voting");
		}
		System.out.println("Hello World!");
	}
}
