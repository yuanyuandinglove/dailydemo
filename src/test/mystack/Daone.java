package test.mystack;

import java.util.Stack;

public class Daone {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	/**
	 * ���������������У���һ�����б�ʾջ��ѹ��˳��
	 * ���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
	 * ��������1,2,3,4,5��ĳջ��ѹ��˳��
	 * ����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
	 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
	 * ��ע�⣺���������еĳ�������ȵģ�
	 * @param pushA
	 * @param popA
	 * @return
	 */
	public boolean IsPopOrder(int [] pushA,int [] popA) {
        boolean b =false;
        Stack stack = new Stack(); 
      
        int  len= pushA.length;
        int i = 0 ;
        int j = 0;
         while(i < len ){
             while(stack.isEmpty()||(int)stack.peek()!=popA[i]){
                  if(j > len-1){
                      break;
                  }
                 stack.push(pushA[j]);
                 j++;
             }
             if((int)stack.peek()!=popA[i]){
                 break;
                  
             }
             stack.pop();
             i++;
            if(stack.isEmpty()&&i==len){
                b = true;
            }
         }
        
        return b; 
        
    }

}
