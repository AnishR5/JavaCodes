package Array;

import java.util.LinkedHashSet;

public class A7Sort {
	
	
	public static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;i<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {5,87,4,26,4,1,3,41,35};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		String s="ascsdc";
		
		LinkedHashSet<Character> chars=new LinkedHashSet<Character>();

	}

}
