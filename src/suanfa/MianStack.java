package suanfa;

import java.util.Stack;


public class MianStack {
	private int size =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MianStack().isMatch("[())"));
		   MianStack stack = new MianStack();
		    stack.add();
		   // stack.sys();
		 

	}
    public boolean isMatch(String str) {  
        Stack<Character> myStack = new Stack<Character>();  
        char[] arr = str.toCharArray();  
        
        for (char c : arr) { 
        	Character temp=null;
        	if(!myStack.isEmpty()){
               temp = myStack.pop();  
        	}
            // ջΪ��ʱֻ��c��ջ  
            if (temp == null) {  
                myStack.push(c);  
            }  
            // ���ʱc����ջ  
            else if (temp == '[' && c == ']') {  
            }   
            // ���ʱc����ջ  
            else if (temp == '(' && c == ')') {  
            }   
            // �����ʱc��ջ  
            else {  
                myStack.push(temp);  
                myStack.push(c);  
            }  
        }  
       
        return myStack.isEmpty();  
    } 
    public void add(){
    	size =size+2;
    	System.out.println("one:"+size);
    }
    public void sys(){
    	System.out.println(size);
    }
}
