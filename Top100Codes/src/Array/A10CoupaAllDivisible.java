package Array;

import java.util.Arrays;

public class A10CoupaAllDivisible {
	
	public static void divisible(int[] arr)
	{
		int lcm=LCM(arr);
		for(int i=0;i<arr.length;i++)
		{
			int diff=lcm-arr[i];
			arr[i]+=diff;
		}
		print(arr);
	}
	
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int LCM(int [] arr)
	{
		Arrays.sort(arr);
		int largest=arr[arr.length-1];
		int lcm=largest;
		boolean flag=true;
		int mul=2;
		while(flag)
		{
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(lcm%arr[i] == 0 )
				{
					count++;
				}
				else
				{
					lcm=largest*mul;
					mul++;
				}					
			}
			if(count== arr.length)
			{
				flag=false;
			}
		}
		System.out.println("Lcm = "+lcm);
		return lcm;
	}

	public static void main(String[] args) {
		
		int[] arr= {12,15,75};
		print(arr);
		divisible(arr);

	}

}
