import java.math.BigDecimal;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListNode {
	public static void main(String []args){
		   
		//System.out.println(sum(1000));
		long l = new Date().getTime();
		//System.out.println(dat1);
	     int sm = sum(10000);
	    long l1 = new Date().getTime();
	    //System.out.println(l1);
	     //System.out.println(sum1(100));
	    System.out.println(new BigDecimal(l1-l)); 
		 long l3 =  new Date().getTime();
			 int sm1 = sum1(10000);
		 long l4 =  new Date().getTime();
		 System.out.println(new BigDecimal(l4-l3));
	}
    public static int sum(int n){
    	 int i  ;
    	 int sum = 0 ;
    	 for(i = 1 ; i <= n ; i++){
    		 sum+= i ;
    	 }
    	return sum;
    }
    public static int sum1(int n){
    	int sum;
    	if(n == 1){
    		return 1 ;
    	}
        sum =n+sum1(n-1);
    	return sum ;
    }
}
