package Array;

import java.util.HashSet;

public class A11Coupa2ArrayOdd {
	
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] arrayC(int[] arr1,int[] arr2, int n)
	{
		HashSet<Integer> sumSet=new HashSet<Integer>();
		int[] C=new int[n];
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				int sum=arr1[i]+arr2[j];
				//System.out.println();
				if(!sumSet.contains(sum) && count<n)
				{
					C[count]=sum;
					count++;
					sumSet.add(sum);
				}
				if(count > n)
				{
					return C;
				}
			}
		}		
		return C;
	}

	public static void main(String[] args) {
		
		int[] arr1= {6,3,2,4,8};
		int[] arr2= {7,2,3,5,1};
		int[] C=arrayC(arr1, arr2, 3);
		print(C);
		
		
	}

}
