package suanfa;

public class PaXuUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n[]={1,4,7,5,3,2,9};
       int ren[]= inSertSort(n) ;
       for(int i = 0 ; i < ren .length ; i ++){
    	   System.out.print(ren[i]+"   ");
       }
	}
	/**
	 * ��������
	 * @param n
	 * @return
	 */
	public static   int [] inSertSort(int n[]){
		for(int i = 1 ; i < n.length-1 ; i++){
			for(int j = i  ; j > 0 ;j --){
				if(n[j]< n[j-1]){
					int tmep =n[j-1];
					n[j-1] = n[j];
					n[j] =tmep;
				}
			}
		}
		return n;
	}

}
