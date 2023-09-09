package Array;

import java.util.Arrays;

public class A1LargestElement {

	public static void main(String[] args) {
		int arr[]= {5,87,4,26,4,1,3,41,35};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println();
		System.out.println("Max = "+max);
		System.out.println("Min="+min);
		
		
		Arrays.sort(arr);
		System.out.println("Largest num: "+arr[arr.length-1]);
		System.out.println("Smallest num: "+arr[0]);

	}

}
