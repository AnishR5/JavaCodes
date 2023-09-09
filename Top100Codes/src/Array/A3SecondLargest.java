package Array;

public class A3SecondLargest {

	public static void main(String[] args) {
		int arr[]= {5,87,4,26,4,1,3,41,35};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
				largest=arr[i];
		}
		System.out.println("Lagest="+largest);
		int secLarge=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=largest && arr[i] > secLarge)
				secLarge=arr[i];
		}
		System.out.println("SecondLarge "+ secLarge);
		
		System.out.println("----------------------------");
		
		int first=arr[0];
		int second=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second)
				second=arr[i];
		}
		
		System.out.println("Second ="+ second );
		
	}

}
