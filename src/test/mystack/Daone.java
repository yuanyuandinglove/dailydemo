package test.mystack;

import java.util.Stack;

public class Daone {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	/**
	 * 输入两个整数序列，第一个序列表示栈的压入顺序，
	 * 请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
	 * 例如序列1,2,3,4,5是某栈的压入顺序，
	 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
	 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
	 * （注意：这两个序列的长度是相等的）
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
