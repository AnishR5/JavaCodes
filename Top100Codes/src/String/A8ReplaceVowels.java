package String;

public class A8ReplaceVowels {
	
	public static String ReplaceVow(String s)
	{
		
		return s.replaceAll("[aeiou]", "");
	}

	public static void main(String[] args) {
		String abc="jndjaxecuiso";
		System.out.println(ReplaceVow(abc));
	}

}
