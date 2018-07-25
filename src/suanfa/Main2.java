package suanfa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * ��Ŀ����
ͷ����2017У�п�ʼ�ˣ�Ϊ�����У�У�������֯��һ����ģ���ĳ����Ŷӡ�ÿ�������˶�����һЩ��Ȥ����Ŀ�����������������Щ��Ŀ��ϳ����ɳ����Գ�������ѡ��֮ǰ�����Ƕ���Ŀ������ä�󣬲�������ÿ������Ѷ�ϵ����һ�����԰���3����������Ŀ���������ǵ��Ѷȴ�С����ֱ�Ϊa, b, c������ϣ����3��������������������
a��= b��= c
b - a��= 10
c - b��= 10
���г�����һ������n����������Ŀ���������������n����ֲ������ɳ������У�1����ೡ��ÿ���ⶼ����ʹ����ֻ����һ�Σ���Ȼ�������������������ƣ�������һЩ����û���չ�3���⣬��˳����˾���Ҫ���һЩ�ʵ��Ѷȵ���Ŀ����ÿ�����Զ��ﵽҪ��Ȼ�����ǳ����Ѿ����ú����ˣ����ܼ�����������ٻ���Ҫ�ٳ���������
����
����ĵ�һ�а���һ������n����ʾĿǰ�Ѿ����õ���Ŀ������
�ڶ��и���ÿ����Ŀ���Ѷ�ϵ�� d1, d2, ��, dn��

 

��������


4

20 35 23 40

 


���


���ֻ����һ�У�������Ĵ𰸡�

 

�������

2
 

 * @author Administrator
 *
 */
public class Main2{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
		int n = sc.nextInt();
		int array [] = new int[n];
		for(int i = 0 ; i < n ;i++){
			array[i] =sc.nextInt();
		}
	//	sc.close();
		int count =0;
		Arrays.sort(array);
		Stack stack =new Stack();
	    stack.push(array[0]);
		for(int j = 1; j <n;j++){
			if(array[j]-array[j-1] <=10){
				stack.push(array[j]);
				if(stack.size() ==3){
					stack.clear();
					j++;
					if(j >= n ){
						break;	
					}
					stack.push(array[j]);
					}
				
			}else{
				System.err.println(count+3-stack.size());
				count =count+3 -stack.size();
				stack.clear();
				stack.push(array[j]);	
			}
			
			}
		   if(stack.size() !=0){
			count =count + 3 -stack.size();
				
			}
		
		
		
		System.out.println(count);
		}
	}
}
	/*public static int[] getQuickSort(int array[]){
		for(int i = 0 ;i < array.length-1 ;i++){
			for(int j = i+1 ; j >0 ;j--){
				if(array[j] < array[j-1]){
					int temp =array[j];
					array[j]=array[j-1];
					array[j-1] =temp;	
				}else{
					break;
				}
				}
			}
		 return array;
		}*/
	


