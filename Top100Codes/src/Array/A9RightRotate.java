package Array;

public class A9RightRotate {
	
	 public static void rotate(int[] nums, int k) {
	        int n = nums.length;
	        k = k % n;  
	        System.out.println("k: "+k);
	        reverse(nums, 0, n - 1);
	        print(nums);
	        reverse(nums, 0, k - 1); 
	        print(nums);
	        reverse(nums, k, n - 1); 
	        print(nums);
	    }
	    
	    public static void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
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
		int [] arr= {1,2,3,4,5,6,7};
		print(arr);
		rotate(arr, 3);
		print(arr);
	}

}
