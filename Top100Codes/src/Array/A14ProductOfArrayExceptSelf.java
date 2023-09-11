package Array;

public class A14ProductOfArrayExceptSelf {
	public static int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int product=1;
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
                    continue;
                else
                {
                    product=product*nums[j];
                }
            }
            answer[i]=product;
        }
        return answer;
    }
	
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr1= {-1,1,0,-3,3};
		print(arr1);
		int[] mul1=productExceptSelf(arr1);
		print(mul1);
	}

}
