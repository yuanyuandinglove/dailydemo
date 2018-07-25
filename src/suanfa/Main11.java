package suanfa;

/**
 * �ϲ�2���ź��������
 * o(m+n)
 * @author Administrator
 *
 */
public class Main11 {
 public static void main(String args[]){
	
	 int a[] = {1,4,5,6};
	 int b [] ={2,3,7,8,9};
	 int c[] =new int[a.length+b.length];
	 int i = 0 ,j=0, k = 0;
	 while (i < a.length&&j<b.length){
		 if(a[i] < b[j]){
			 c[k]=a[i];
			 i++;
		 }else{
			 c[k]=b[j];
			 j++;
			 
		 }
		k++;
	 }
	 while( i <a.length){
		 c[k] =a[i];
		 i++;
		 k++;
		 
	 }
	 while( j <b.length){
		 c[k] =b[j];
		 j++;
		 k++;
		 
	 }
	 for(int z = 0 ; z < c.length; z++){
		 System.out.print(c[z]+" ");
	 }
 }
}
