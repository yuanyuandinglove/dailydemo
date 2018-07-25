package suanfa;

import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		System.out.println(main(s));
		System.out.println(s.split(main(s))[0].length());
		
	}

	
	public static  String main (String s){
	    int count = 0;
    	if(s.length() == 0){
    		return "";
    	}
    	String reString = s.substring(0,1);
    	for(int i = 0 ; i  < s.length() - 1 ; i ++){
    	 String	p1=getString(s, i, i);

    	 if(p1.length()> reString.length()){
    		 reString = p1;
    		 
    	 }
    	 String p2 =getString(s, i, i+1);
    	 if(p2.length() >= reString.length()){
    		 reString = p2;
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
    	String s1= "";
    	while(left >=0&&right <=s.length()-1&&s.charAt(left)==s.charAt(right)){
    		left--;
    		right++;
    		
    	}
    
    	s1 =s.substring(left+1,right);
    
    //	return s.substring(left+1,right);
    
    	return s1;
    }
}
