package String;

public class A4Defang {
	 public static String defangIPaddr(String address) {
 	    StringBuilder defang=new StringBuilder();

    for(char c : address.toCharArray())
    {
        if(c == '.')
        {
            defang.append("[.]");
        }
        else
         defang.append(c);
    }
     return defang.toString();
}

	public static void main(String[] args) {
		String ip="255.100.50.0";
		System.out.println(defangIPaddr(ip));
	}

}
