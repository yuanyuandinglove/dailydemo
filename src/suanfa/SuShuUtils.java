package suanfa;

/**
 * ?? ?? n ??????
 * @author Administrator
 *
 */
public class SuShuUtils {
	public static void main(String args[]) {
		//boolean b = isSuShu(11);
		//System.out.println(b);
	//	int di1001 = getDixsushu(11);
	//	System.out.println(di1001);
	boolean b =isSuShu(17);
	System.out.println(b);
	}
	/**
	 * ???????? ????????
	 * @param di
	 * @return
	 */
   public static int  getDixsushu(int di ){
	   System.out.println("????????"+di+"????:");
	    int retunsushu=0;
	    int count = 0 ;
	    int  i = 2;
	    while(i >=2){
	    	if(count == di){
	    		retunsushu =i-1 ;
	    		break;
	    	}else{
	    		boolean b = isSuShu(i);
	    		if(b){
	    			 count++;
	    		}
	    		
	    	//	System.out.println(i+"-"+b+"-"+count);		
	    	}
	    	System.out.println("this??"+i);
	    	++i;
	    	//System.out.println("this1??"+i);
	    }
	//    System.out.println(count);
	   return retunsushu;
	
}
   /**
    * ???????????????????
    * ??????true;
    * @param i
    * @return
    */
	public static boolean isSuShu(int i) {
		boolean b = false;
		if (i >= 2) {
			if (i == 2) {
				b = true;
			}
			if (i > 2) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						break;
					} 
					if(j==i-1){
						b =true;
					}
				System.out.println(j);
				}
			}
		}
		
		return b;

	}
}
