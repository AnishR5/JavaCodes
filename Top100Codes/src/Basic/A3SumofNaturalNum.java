package Basic;

import java.util.Scanner;

public class A3SumofNaturalNum {
	
	public static void Sum(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of first "+num+"Natural nums ="+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		Sum(num);

	}

}
