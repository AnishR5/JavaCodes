package String;

public class A3MatchRotation {
	
	public static boolean match(String s,String rot)
	{
		
		char[] carr1=s.toCharArray();
		char[] carr2=s.toCharArray();
		
		
		for(int i=0;i<2;i++)
		{
			char start=carr1[0];
			//left shift
			for(int j=0;j<carr1.length-1;j++)
			{
				carr1[j]=carr1[j+1];
			}
			carr1[carr1.length-1]=start;
			
			//right shift
			
		}
		if(String.valueOf(carr1).equals(rot))
			return true;		
		print(carr1);
		return false;
	}
	
	public static void print(char[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		String s="amazon";
		String rot="azonam";
		match(s,rot);
	}

}
