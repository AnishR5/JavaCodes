package String;

import java.util.Stack;

public class A9Palindrome {
	
	public static boolean isPalindrome(String str)
	{
		Stack<Character> charStack=new Stack<Character>();
		//String rev="";
//		for(Character c: str.toCharArray())
//		{
//			charStack.add(c);
//		}
//		for(int i=0;i<str.toCharArray().length;i++)
//		{
//			rev=rev+charStack.pop();
//		}
		
		StringBuilder stb=new StringBuilder(str);
		String rev=stb.reverse().toString();
		System.out.println(rev);
		if(str.equals(rev))
			return true;
		return false;
	}

	public static void main(String[] args) {
		
		String s="aba";
		String s2="jds";
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome(s2));
		
	}

}
