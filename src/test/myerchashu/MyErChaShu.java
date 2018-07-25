package test.myerchashu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyErChaShu {
	private  Node root = null;
	public MyErChaShu(int data){
		this.root  =new Node(1,data);
		
	}
	public void CreateTree(Node node1){
		MyErChaShu myshu= new MyErChaShu(1);
	       System.out.println();
	       Node node2 = new Node(2,2);
	       Node node3 = new Node(3,3);
	       Node node4 = new Node(4,4);
	       Node node5 = new Node(5,5);
	       Node node6 = new Node(6,6);
	       Node node7 = new Node(7,7);
	       node1.leftchild =node2;
	       node1.rightchild = node3;
	       node2.leftchild =node4;
	       node2.rightchild = node5;
	       node3.leftchild = node6;
	       node3.rightchild = node7;
	       
	}
	public boolean isempty(){
		return root == null;
		
	}
	/**
	 * �ڵ�ĸ���
	 * @return
	 */
  public int size(){
	  return size(root);
  }
		
	private int size(Node root) {
	if(root == null){
		return 0;
	}else{
		return  1+size(root.leftchild)+size(root.rightchild);
	}
	
}
	public int height(){
		return height(root);
	}

	
	private int height(Node root) {
		// TODO Auto-generated method stub
		
		if(root ==null){
			return 0;
		}else{
			int i = height(root.leftchild);
			int j = height(root.rightchild);
			//System.out.println(i+""+j);
			return (i< j)?(j+1):(i+1);
		}
	}
	/**
	 * �������
	 * @param node
	 */
	private void xianxubianli(Node node ){
		if(node !=null){
		  vistied(node);
		  xianxubianli(node.leftchild);
		  xianxubianli(node.rightchild);
		}
		
	}
	public void zhongxubianli(Node node){
		if(node !=null){
			  zhongxubianli(node.leftchild);
			  vistied(node);
			 zhongxubianli(node.rightchild);
			}
		
		
	}
	public void hhouxubinali(Node node){
		if(node !=null){
			  
			
			hhouxubinali(node.leftchild);
			hhouxubinali(node.rightchild);
			  vistied(node);
			}
		
		
	}
	 //ǰ������ķǵݹ�ʵ��  
    public void nonRecPreOrder(Node p){  
        Stack<Node> stack=new Stack<Node>();  
        Node node=p;  
        while(node!=null||stack.size()>0){  
            while(node!=null){ 
                vistied(node);  
                stack.push(node);  
                node=node.leftchild;  
            }  
            while(stack.size()>0){ 
                node=stack.pop();  
                node=node.rightchild;  
            }   
        }  
    }  
      
    //��������ķǵݹ�ʵ��  
    public void nonRecInOrder(Node p){  
        Stack<Node> stack =new Stack<Node>();  
        Node node =p;  
        while(node!=null||stack.size()>0){  
            //����������  
            while(node!=null){  
                stack.push(node);  
                node=node.leftchild;  
            }  
            //ջ�ǿ�  
            if(stack.size()>0){  
                node=stack.pop();  
                vistied(node);  
                node=node.rightchild;  
            }  
        }  
    }  
      
    //��������ķǵݹ�ʵ��  
    public void noRecPostOrder(Node p){  
        Stack<Node> stack=new Stack<Node>();  
        Node node =p;  
        while(p!=null){  
            //��������ջ  
            for(;p.leftchild!=null;p=p.leftchild){  
                stack.push(p);  
            }  
            //��ǰ��������������������Ѿ����  
            while(p!=null&&(p.rightchild==null||p.rightchild==node)){  
                vistied(p);  
                //��¼��һ����������  
                node =p;  
                if(stack.empty())  
                    return;  
                p=stack.pop();  
            }  
            //����������  
            stack.push(p);  
            p=p.rightchild;  
        }  
    }  
    /**
     * �������İ���α���
     * @param root
     */
    public void  cengBianLi(Node root ){
    	Node node = null;
    	if(root != null){
    		Queue myqueue = new LinkedList<Node>();
    	   myqueue.offer(root);
    	   while(!myqueue.isEmpty()){
    		   node = (Node) myqueue.poll();
    		   System.out.println(node.data);
    		   if(node.leftchild!=null){
    			   myqueue.offer(node.leftchild);
    		   }
    		   if(node.rightchild!=null){
    			   myqueue.offer(node.rightchild);
    		   }
    		   
    	   }
    	}
    }
	public void vistied(Node node){
		System.out.println("weizhi:"+node.posttion+"data:"+node.data);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
      MyErChaShu my = new MyErChaShu(1);
      my.CreateTree(my.root);
      //System.out.println(my.height());
    //  System.out.println(my.size());
      my.xianxubianli(my.root);
      System.out.println("-----");
      my.zhongxubianli(my.root);
      System.out.println("-----");
      my.hhouxubinali(my.root);
      my.cengBianLi(my.root);
	}
   
}
