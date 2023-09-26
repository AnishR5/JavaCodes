package Array;

import java.util.ArrayList;

public class A20SubArraySum {
	
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
         ArrayList<Integer> list = new ArrayList<>();

        int start = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            
          
            while (sum > s) {
                sum -= arr[start];
                start++;
            }

          
            if (sum == s) {
                list.add(start + 1); 
                list.add(i + 1);
                return list;
            }
        }

        list.add(-1); 
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
