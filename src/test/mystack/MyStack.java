package test.mystack;

import java.util.Stack;

public class MyStack<T> {
	private Object  obj [];
	public int n;
	private int size;
	public MyStack(int n ){
		size=0;
		
		this.n = n;
	  obj = new Object[n];
	}
	/**
	 * 
	 */
	public int getsize(){
		return size;
	}
	/**
	 * 入栈
	 * @param data
	 */
    public void  add(T data){
    	if(size >= n-1){
    		reerse();
    	}
    	obj[size] =data;
    	size++;
    }
    public T getT(){
    	if(size >0){
    	Object t = obj[size-1];
    	size =size-1;
    	return (T)t;
    	}else{
    	return null;
    	}
    }
	private void reerse() {
		Object obj1 [] = new Object[n*3/2+1];
		for(int i = 0 ; i < n ; i++){
			obj1[i] =obj[i];
		}
		obj =obj1;
		
	}
   public void clear(){
	   for(int i = 0 ; i< size ;i++){
		   obj[i] =null; 
	   }
   }
   /**
    * 斐波切数列
    * @param n
    * @return
    */
   public int Fibonacci(int n) {
       int first = 0 ; 
        int second = 1 ;
        int target = 0;
          if(n < 2){
            return n ;

         }else{
       
        for(int i = 0 ; i < n-1 ;i++){
            target =first + second;
            first = second ;
            second = target ;
          
      }
    return target;
}
}
   /**
    * 用2个 栈表示队列的的pop 和push
    * @param args
    */
   public class Solution {
	    Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        stack1.push(node);
	    }
	    
	    public int pop() {
	        int pop;
	        while(!stack1.isEmpty()){
	            stack2.push(stack1.pop());
	        }
	         pop= stack2.pop();
	        while (!stack2.isEmpty()){
	            stack1.push(stack2.pop());
	        }
	        return pop;
	    
	    }
	}
    public static void main(String args[]){
    	MyStack<Integer> stack = new MyStack<Integer>(17);
    	stack.add(1);
    	stack.add(2);
    	stack.add(3);
    	stack.add(4);
    	stack.add(5);
    	System.out.println(stack.size);
    	System.out.println(stack.getT());
    	System.out.println(stack.getT());
    	System.out.println(stack.size);
    	System.out.println(stack.obj[2]);
    	
    }
}
