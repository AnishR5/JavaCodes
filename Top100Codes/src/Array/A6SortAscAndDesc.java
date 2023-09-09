package Array;

public class A6SortAscAndDesc {
	
	public static void sort(int[] arr)
	{
		int mid=arr.length/2;
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=0;j<=mid;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			for(int k=mid+1;k<arr.length-1;k++)
			{
				if(arr[k]<arr[k+1])
				{
					int temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
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
		

	}

}
