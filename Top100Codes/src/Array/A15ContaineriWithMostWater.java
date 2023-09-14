package Array;

public class A15ContaineriWithMostWater {
	
//	 public static int maxArea(int[] height) {
//	      int maxArea=0;
//	      for(int i=0;i<height.length;i++)
//	      {
//	        for(int j=1;j<height.length;j++)
//	        {
//	          int len=j-i;
//	          int h=Math.min(height[i],height[j]);
//	          maxArea=Math.max(maxArea,len*h);
//	        }
//	      }
//	      return maxArea;        
//	    }
	 
	 public static int maxArea(int[] height)
	 {
		 int maxArea=0;
		 int left=0;
		 int right=height.length;
		 
		 while(left<right)
		 {
			 int len=right-left;
			 int h=Math.min(height[left], height[right]);
			 maxArea=Math.max(maxArea, len*h);
			 
			 if(height[left] < height[right])
				 left++;
			 else
				 right--;
		 }
		 return maxArea;
	 }

	public static void main(String[] args) {
		int[] height= {1,8,6,2,5,4,8,3,7};
		System.out.println("Max Area= "+maxArea(height));

	}

}
