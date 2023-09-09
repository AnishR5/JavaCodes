package Array;

import java.util.HashSet;

public class A8LongestSubString {
	
	public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
       int maxLength = 0;
       int left = 0;
       int right = 0;
       HashSet<Character> charSet = new HashSet<>();

       while (right < n) {
           if (!charSet.contains(s.charAt(right))) {
               charSet.add(s.charAt(right));
               
               maxLength = Math.max(maxLength, right - left + 1);
               right++;
               System.out.println(charSet + " Left: "+left+" Right:"+right + " Maxlength:"+maxLength);
           } else {
               charSet.remove(s.charAt(left));
               
               left++;
               System.out.println(charSet + "Left: "+left+" Right:"+right+ " Maxlength:"+maxLength);
           }
       }
       System.out.println(charSet);

       return maxLength;

   }

	public static void main(String[] args) {
		String s="pwwkew";
		System.out.println(lengthOfLongestSubstring(s));

	}

}
