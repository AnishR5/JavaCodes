package Array;

public class A16GoodPair {
	
	  public static int numIdenticalPairs(int[] nums) {
	        int count=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=0;j<nums.length;j++)
	            {
	                if(nums[i]==nums[j] && i<j)
	                {
	                   // System.out.println(i+" "+j);
	                    count++;
	                }
	            }
	        }
	        return count;
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
		
		int[] arr= {1,2,3,1,1,3};
		int[] freq=new int[10];
		for(int num:arr)
		{
			freq[num]++;
		}
		print(arr);
		print(freq);
		
		System.out.println(numIdenticalPairs(arr));
		
		

	}

}
