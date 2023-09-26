package String;

import java.util.HashMap;
import java.util.Map;

public class A10PrintDuplicateChars {
	
	public static void dupChare(String s)
	{
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
				map.put(s.charAt(i), 1);
		}
		
		for (Map.Entry<Character,Integer> mapElement : map.entrySet()) {   //iterating through the unordered map
		      if (mapElement.getValue() > 1)   //if the count of characters is greater than 1 then duplicate found
		        System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
		    }
	}

	public static void main(String[] args) {
		
		String s="GeeksforGeeks";
		dupChare(s);
		
		

	}

}
