package Array;

public class A12ArrayFreq {

	public static void main(String[] args) {
		int [] arr= {1, 2, 8, 3, 2, 2, 2, 5, 1};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("---------------------------");
		int[]arrfreq=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int freq=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					freq++;
				}
			}
			arrfreq[i]=freq;
		}
		for(int i=0;i<arrfreq.length;i++)
		{
			System.out.print(arrfreq[i]+" ");
		}

	}

}
