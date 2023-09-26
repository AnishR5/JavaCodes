package Array;

public class A18ReverseArray {
	
	public static void reverse(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start <= end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
	
	public static void print(int[] arr)
	  {
		  for(int i:arr)
		  {
			  System.out.print(i+" ");
		  }
		  System.out.println();
	  }

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		reverse(arr);
		print(arr);
	}

}
