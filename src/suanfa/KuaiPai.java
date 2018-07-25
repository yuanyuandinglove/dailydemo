package suanfa;


public class KuaiPai {
	 static int a[]={5,3,4,8,6,4};
 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(a,0,a.length-1);
	  for(int i = 0 ; i < a.length ; i++){
		System.out.println(a[i]);
	}
	}
  public static  void quickSort(int []a, int low , int heigh){
	  int  i = low;
	 // System.out.println("this"+i);
	  int j = heigh;
	  int key = a[i];
	  while(i < j){
	  while (j > i&&a[j] >=key ){
		  j--;
	  }
	  if(i < j){
		  int temp = a[j];
		  a[j]= a[i];
		  a[i] =temp;
		  i++;
	  }
	  if(j > i &&a[i] <= key){
		  i++;  
	  }
	  if(j > i ){
		  int tmep = a[j];
		  a[j] =a[i];
		  a[i] =tmep;
		j--;  
	  }
	  if(i > low){
		  quickSort(a, low, i-1);
	     }
	    if(j < heigh){
		  quickSort(a, i+1, heigh);
	  }
	  }
  }
 
}