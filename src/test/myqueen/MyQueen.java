package test.myqueen;
/**
 * 循环队列
 * @author Administrator
 *
 * @param <T>
 */
public class MyQueen<T> {
	private static final String Integer = null;
	private int rear;//队尾
	private int font;//对头
	private Object  []obj;
	private int n ;//队列的总长度
	private int size;//当前队长度
	public MyQueen(int n){
		rear = 0;
		font = 0;
		this.n =n;
		size = 0;
		obj=new Object[n];
		
	}
	/**
	 * 入队列
	 * @param t
	 * @return
	 */
   public boolean pullQueen(T t){
	   if(size == n){
		   return false;
		   
	   }else{
		   obj[rear] =t;
		   rear =(rear+1)% n;
		   size++;
	   }
	   return true;
	   
   }
   /**
    * 出队
    * @return
    */
   public T pushQueen(){
	    T t;
	   if(size ==0){
		   t = null;
	   }else{
		   t = (T) obj[font];
		   font=(font+1)%n;;
		   size--;
	   }
	  return t; 
   }
   public int getszie(){
	   return size;
   }
   public void sys(){
	   for(int i = 0 ; i< n ;i++){
		   System.out.print(obj[i]+" ");
	   }
	   
   }
   public void clere(){
	   for(int i = 0 ; i< obj.length ;i++){
		   obj[i] = null;
	   }
	   size =0;
	   rear =font=0;
   }
   public static void main(String args[]){
	  MyQueen<Integer> myqueen = new MyQueen<Integer>(10);
	  myqueen.pullQueen(1);
	  myqueen.pullQueen(2);
	  myqueen.pullQueen(3);
	  myqueen.pullQueen(4);
	  myqueen.pullQueen(5);
	  myqueen.pullQueen(6);
	  myqueen.pullQueen(7);
	  myqueen.pullQueen(8);
	  myqueen.pullQueen(9);
	  myqueen.pullQueen(10);
	  System.out.println(myqueen.getszie());
	  myqueen.sys();
	  int x =  myqueen.pushQueen();
	  System.out.println("this:"+x);
	  System.out.println("queen:"+myqueen.font);
	  myqueen.pullQueen(5);
	  myqueen.sys();
	   System.out.println(myqueen.pullQueen(16));
	   myqueen.clere();
	   System.out.println(myqueen.size);
	   myqueen.sys();
   }
}
