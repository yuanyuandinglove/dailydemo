package suanfa;

import java.util.Scanner;


public class Main1 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int count = 0 ;
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int a[] = new int [n];
			for(int i = 0; i < n ; i++){
				a[i]=sc.nextInt();
			}
			 for(int i = 0 ; i <n-1;i++){
				 for(int j = i+1; j< n ;j++){
					count +=getcount(a[i], a[j]);
				 }
		    	  
		      }
			 System.out.println(count);
		}
	}
	/**
     * ����2����֮�������ĸ���
     * @return
     */
  
    public static int  getcount(int start, int end){
    	int count = 0;
    	for(int i = start ;i < end;i ++ ){
    		if(isSuShu(i)){
    			count++;
    		}
    		
    	}
    	return count;
    }
    public static boolean isSuShu(int n){
    	boolean b = false ;
    	if(n ==2){
    		b =true;
    	}
    	if(n > 2){
    		for(int i = 2 ; i < n ; i++){
    			if(n % i ==0){
    				break;
    			}
    			if(i == n-1){
    				b = true ;
    			}
    			
    		}
    	}
    	return b;
    	
    	
    }

}
