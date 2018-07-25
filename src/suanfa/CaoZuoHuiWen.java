package suanfa;

public class CaoZuoHuiWen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,1,5,3,4,3,4,1,2};
		int b[] =getHuiwen(a);
		for(int i = 0 ; i < b.length ;i++){
			if(b[i]!=0){
				System.out.println(b[i]+"");
			}
		}
		

	}
	/**
	 * ????????飬???????λ?????????????????λ???
	 * @param a
	 * @return
	 */
  public static int[] getHuiwen(int a[]){
	  int len =a.length;
	  int begin = 0 ;
	  int end =len - 1;
	  int count = 0 ;
	  while(begin < end){
		  if(a[begin]==a[end]){
			  begin++;
			 
			  end--;
			  
		  }
		  if(a[begin] > a[end]){
			  a[end-1] =a[end]+a[end-1];
			  end--;
			  count++;
		  }
		  if(a[begin] < a [end]){
			  a[begin+1] =a[begin]+a[begin+1];
			  begin++;
			  count++;
		  }
	  }
	  return a;
  }
}
