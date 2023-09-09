
public class A9RemoveDuplicate2 {
	 public static int removeDuplicates(int[] nums) {

	        if(nums.length <= 2)
	            return nums.length;

	        int i=2;
	        int count=2;

	        for(int j=2;j<nums.length;j++)
	        {
	            if(nums[j]!=nums[i-2])
	            {
	                nums[i]=nums[j];
	                i++;
	                count++;
	            }
	            for(int k=0;k<nums.length;k++)
	    		{
	    			System.out.print(nums[k]+"");
	    		}
	            System.out.println();
	        }
	        return count;
	        
	    }

	public static void main(String[] args) {
		int[] nums= {1,1,1,2,2,3};
		
		removeDuplicates(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+"");
		}

	}

}
