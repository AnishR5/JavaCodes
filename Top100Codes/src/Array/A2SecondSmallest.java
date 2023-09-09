package Array;

public class A2SecondSmallest {

	public static void main(String[] args) {
		int arr[]= {5,87,4,26,4,1,3,41,35};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("min="+min);
		int secMin=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=min && arr[i]<secMin )
				secMin=arr[i];
		}
		System.out.println("Second smallest = "+secMin);
		
		System.out.println("-----------------------");
		int first=arr[0];
		int second=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<first)
			{
				second=first;
				second=arr[i];
			}
			else if(arr[i]<second)
				second=arr[i];
		}
		System.out.println("Second = "+second);
	}

}
