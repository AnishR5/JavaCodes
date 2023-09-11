package Basic;

public class A6Power {
	
	  public static double myPow(double x, int n) {
	        double ans=1;
	        if(n==0)
	            return 1;
	        if(n<0)
	        {
	            x=1/x;
	            n=Math.abs(n);
	        }       
	        for(int i=1;i<=n;i++)
	        {
	            ans=ans*x;
	        }      
	        return ans;
	    }
	
//	public static double myPow(double x, int n) {
//        double ans=1;
//        if(n==0)
//            return 1;
//
//        if(n>0){ 
//        for(int i=1;i<=n;i++)
//        {
//            ans=ans*x;
//        }
//        }
//        else{
//           n=Math.abs(n);
//            for(int i=1;i<=n;i++)
//            {
//                ans=ans/x;
//            }
//        }
//        return ans;
//    }

	public static void main(String[] args) {
		System.out.println(myPow(2, 5));

	}

}
