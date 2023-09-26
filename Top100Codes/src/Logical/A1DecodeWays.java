package Logical;

public class A1DecodeWays {

	public static void main(String[] args) {
		String s="10699";
		int count=0;
		int zeros=0;
		for(char c:s.toCharArray())
		{
			count++;
			if(c == '0')
				zeros++;
		}
		System.out.println(count+" "+zeros);

	}

}
