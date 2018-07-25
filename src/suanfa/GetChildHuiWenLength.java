package suanfa;

/**
 * ����һ���ַ��������������ַ����ĳ���
 * @author Administrator
 *
 */
public class GetChildHuiWenLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s =getMaxlenthString("sssogou");
	System.out.println(s);
       System.out.println(s.length());
	}
    public static  String  getMaxlenthString(String s){
    	if(s.length() == 0){
    		return "";
    	}
    	String reString = s.substring(0,1);
    	for(int i = 0 ; i  < s.length() - 1 ; i ++){
    	 String	p1 =getString(s, i, i);
    	 if(p1.length()> reString.length()){
    		 reString = p1;
    	 }
    	 String p2 =getString(s, i, i+1);
    	 if(p2.length() > reString.length()){
    		 reString = p2 ;
    		 
    	 }
    		 
    	 
    	}
    	
    	return reString;
    	
  
}
    /**
     * ���м�����������
     * @param s
     * @param left
     * @param right
     * @return
     */
    public  static String getString(String s , int left , int right){
    	while(left >=0&&right <=s.length()-1&&s.charAt(left)==s.charAt(right)){
    		left--;
    		right++;
    		
    	}
    	return s.substring(left+1,right);
    	
    }
 
    
    
}