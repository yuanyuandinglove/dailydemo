import java.util.Stack;

import javax.print.attribute.standard.Sides;


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
            // 栈为空时只将c入栈  
            if (temp == null) {  
                myStack.push(c);  
            }  
            // 配对时c不入栈  
            else if (temp == '[' && c == ']') {  
            }   
            // 配对时c不入栈  
            else if (temp == '(' && c == ')') {  
            }   
            // 不配对时c入栈  
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
