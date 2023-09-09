package Array;

public class A5ReverseArray {
	
	public static void reverese(int [] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{	
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
				
	}

	public static void main(String[] args) {
		int arr[]= {5,87,4,26,4,1,3,41,35};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		reverese(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
