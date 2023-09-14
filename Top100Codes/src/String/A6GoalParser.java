package String;

public class A6GoalParser {
	
//	public static String interpret(String command)
//	{
//		StringBuilder inter=new StringBuilder();
//		
//		for(int i=0;i<command.length();i++)
//		{
//			char c=command.charAt(i);
//			if(c == 'G')
//				inter.append('G');
//			else if(c=='(')
//			{
//				if(i+1<command.length() && command.charAt(i+1)==')')
//				{
//					inter.append('o');
//					i++;
//				}
//				else
//				{
//					inter.append("al");
//					i+=3;
//				}
//			}
//		}
//		return inter.toString();
//	}
	
	public static String interpret(String command)
	{
		return command.replace("()","o").replace("(al)","al");
	}

	public static void main(String[] args) {
		System.out.println(interpret("G()()()()(al)"));
		System.out.println(interpret("(al)G(al)()()G"));

	}

}
