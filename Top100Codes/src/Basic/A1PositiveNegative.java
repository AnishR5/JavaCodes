package Basic;

import java.util.Scanner;

public class A1PositiveNegative {
	public static void PositiveNegative(int number)
	{
		String result=number>0?"Positive":"Negative";
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		PositiveNegative(num);
	}

}
