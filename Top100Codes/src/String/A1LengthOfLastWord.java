package String;

public class A1LengthOfLastWord {
	
	public static int lengthOfLastWord(String s)
	{
		String[] arr= s.split(" ");
		return arr[arr.length-1].length();
	}

	public static void main(String[] args) {
		String s="Hello World";
		
		System.out.println(lengthOfLastWord(s));
	}

}
