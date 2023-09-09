package Basic;

import java.util.Scanner;

public class A5GreatestOfTwo {
	
	public static void Greatest(int a,int b)
	{
		System.out.println(a>b?"Greatest = "+a:"Greatest = "+b);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		Greatest(sc.nextInt(), sc.nextInt());
	}

}
