package Basic;

import java.util.Scanner;

public class A2OddEven {
	
	public static void OddEven(int num)
	{
		int rem=num%2;
		System.out.println(rem==0?"Even":"Odd");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		OddEven(num);

	}

}
