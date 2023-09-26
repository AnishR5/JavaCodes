package Array;

import java.util.Arrays;

public class A17MedianOfSortedArray {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int size=nums1.length+nums2.length;
        int[] arr=new int[size];
        int len=0;
        for(int i=0;i<size;i++)
        {
            if(i<nums1.length)
            {
                arr[i]=nums1[i];
            }
            else
            {
                arr[i]=nums2[len];
                len++;
            }
        }
        Arrays.sort(arr);
        print(arr);
        if(size%2!=0)
        {
            return arr[size/2];
        }
        else
        {
            return (double)(arr[size/2-1]+arr[(size/2)])/2;
        }

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
		int[] a1= {1,3};
		int[] a2= {2};
		//findMedianSortedArrays(a1, a2);
		System.out.println(findMedianSortedArrays(a1, a2));

	}

}
