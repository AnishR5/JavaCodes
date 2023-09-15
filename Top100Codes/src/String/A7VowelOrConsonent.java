package String;

public class A7VowelOrConsonent {
	
	public static boolean checkVowel(char character)
	{
		if(character == 'a' ||character == 'e' ||character == 'i' || character =='o' ||character == 'u')
			return true;
		return false;
	}

	public static void main(String[] args) {
		char abc='a';
		System.out.println(checkVowel(abc));
		System.out.println(checkVowel('d'));
	}

}
