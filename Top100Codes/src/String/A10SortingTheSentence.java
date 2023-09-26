package String;

public class A10SortingTheSentence {
	
	 public static String sortSentence(String s) {
	        String[] arr=s.split(" ");
	        String[] arr2=new String[arr.length];

	        for(String str:arr)
	        {
	            int num=Integer.parseInt(String.valueOf(str.charAt(str.length()-1)));
	            arr2[num-1]=str.substring(0,str.length()-1);
	        }
	        
	        StringBuilder strbldr=new StringBuilder();

	        for(String str:arr2)
	        {
	            strbldr.append(str+" ");
	        }
	       
	       if (strbldr.length() > 0 && strbldr.charAt(strbldr.length() - 1) == ' ') {
	    
	    strbldr.setLength(strbldr.length() - 1);
	}
	        return strbldr.toString();

	    }
	public static void main(String[] args) {
		String s="is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));

	}

}
