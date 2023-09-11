	package String;
	
	import java.util.Stack;
	
	public class A2ReverseWordInString {
		
		public static void print(String[] arr)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
		}
		public static String reverseWords(String s) {
			Stack<String> stack=new Stack<String>();
	        //s=s.trim();
	        String [] arr=s.split("\\s+");
	        for(int i=0;i<arr.length;i++)
	        {
	        	if(!arr[i].equals("  "))
	        	stack.add(arr[i]);
	        }
	       String reverse="";
	       while(!stack.empty())
	       {
	    	   reverse=reverse.concat(stack.pop()+" ");
	       }
	       //System.out.println(reverse);
	       return reverse.trim();
	    }
	
		public static void main(String[] args) {
			String s="the sky is blue";
			String s2="  hello world  ";
			String s3="a good   example";
	//		String[] arr1=s.split(" ");
	//		s2=s2.trim();
	//		String[] arr2=s2.split(" ");
	//		s3=s3.trim();
	//		String [] arr3=s.split(" ");
	//		print(arr1);
	//		print(arr2);
	//		print(arr3);
//			System.out.println(s);
//			System.out.println(reverseWords(s));
			System.out.println(s3);
			System.out.println(reverseWords(s3));
		}
	
	}
