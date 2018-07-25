package test.myerchashu;

public class Node {
  public Node leftchild;
  public Node rightchild;
  public int data;
  public int posttion;
  public Node(int posttion,int data){
	  this.posttion = posttion;
	  this.data =data;
	  leftchild =null;
	  rightchild =null;
  }
  }
