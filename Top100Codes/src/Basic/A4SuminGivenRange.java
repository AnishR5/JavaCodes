package Basic;

import java.util.Scanner;

public class A4SuminGivenRange {
	
	public static void Sum(int start,int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			sum+=i;
		}
		System.out.println("Sum="+sum);
	}
//	public static int SumRec(int start,int end)
//	{
//		int sum;
//		if(start < end)
//			 sum=start + SumRec(start+1, end);
//		return sum;
//	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range");
		Sum(sc.nextInt(), sc.nextInt());
		

	}

}
