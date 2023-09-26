package Array;

public class A19MaxMin {
	
	
	public static void maxMin(int[] arr)
	{
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
		}
		System.out.println("Max="+max+" Min"+min);
	}

	public static void main(String[] args) {
		
		int[] arr= {56,2,7,32,6,98,5};
		maxMin(arr);
	}

}
