package String;

public class A5StonesAndJewels {
	
	public static int numJewelsInStones(String jewels, String stones)
	{
		int count=0;
		
		for(char stone : stones.toCharArray())
		{
			if(jewels.indexOf(stone) != -1)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));
	}

}
