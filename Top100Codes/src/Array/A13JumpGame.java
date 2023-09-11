package Array;

public class A13JumpGame {
	
	 public static boolean canJump(int[] nums) {
	        int pos=0;
	        int maxReach=0;
	        while(pos < nums.length){

	        if(nums.length==1)
	            return true;

	        if(nums[pos] == 0)
	            return false;

	        if(pos == nums.length -1)
	            return true;
	        
	        int far=pos+nums[pos];

	        if(far > maxReach)
	            maxReach=far;
	       
	        pos++;        
	       
	        }
	        return false;
	    }
	
//	public static boolean canJump(int[] arr)
//	{
//		int pos=0;
//		int count=0;
//		
//		while(pos!= arr.length -1)
//		{
//			if(pos ==0)
//				pos=1;
//			else
//			{
//				pos=pos+arr[pos];
//			}
//			if(pos == arr.length -1)
//				return true;
//			if(count==3)
//				break;
//			count++;
//		}
//		return false;
//	}

	public static void main(String[] args) {
		int[] arr1= {2,3,1,1,4};
		int [] arr2= {3,2,1,0,4};
		System.out.println(canJump(arr1));
		System.out.println(canJump(arr2));
	}

}
