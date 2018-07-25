package test.mycreateshu;

public class CreateTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pre[] ={1,2,4,7,3,5,6,8};
		int zr [] ={4,7,2,1,5,3,8,6};
	//	Node node=reCreatBineryTree(pre, 0, pre.length - 1 , zr, 0, zr.length - 1);
       Node node = reConstructBinaryTree(pre, zr);
		xianxubianli(node);
      
	}
	/**
	 * 根据先序遍历和中序遍历构建二叉树
	 * @param pre
	 * @param prstart
	 * @param prend
	 * @param zr
	 * @param zrstart
	 * @param zrend
	 * @return
	 */
    public static Node reCreatBineryTree(int pre[],int prstart,int prend,int zr[],int zrstart,int zrend){
    	
    	Node node = new Node( pre[prstart]);
    	node.leftChild = null;
    	node.rightChild =null;
        if(prstart == prend && zrstart == zrend){
        	return node;
        }
        int root ;
        for(root =0 ;root < zrend ;root++){
        	if(pre[prstart] == zr[root]){
        		break;
        	}
        }
        int  left  = root -zrstart;
        int  right = zrend -root;
        if(left > 0){
        node.leftChild  =reCreatBineryTree(pre, prstart+1, prstart+ left, zr, zrstart, root-1);
        	
        }
        if(right > 0){
        node.rightChild =	reCreatBineryTree(pre, prstart+left+1, prend, zr, root+1, zrend);
        }
    	return node;
    	
    }
    public static  void xianxubianli(Node node){
    	 if(node != null){
    		 System.out.println(node.val);
    		 xianxubianli(node.leftChild);
    		 xianxubianli(node.rightChild);
    	 }
    }
    /**
     * 另外的一种方法
     * @param pre
     * @param in
     * @return
     */
    public static  Node reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0 || pre.length != in.length ){
            return  null;
        }
      Node node = new Node(pre[0]);
        if(pre.length ==1){
            return node;
        }
        int root = 0;
        while(in[root]!= pre[0]){
            root++;
        }
        int preleft[] = new int [root] ;
        int inleft [] = new int [root];
        int preright [] = new int [pre.length-root -1];
        int inright [] = new int [pre.length - root - 1];
        for(int i = 0 ; i < in.length ; i++){
            if (i < root ){
                preleft[ i] = pre[i + 1];
                inleft [i] = in[i];
            }else if(i > root ){
                preright[i - root - 1] = pre[i];
                inright [i - root - 1] = in [i];
            }
        }
       node.leftChild =  reConstructBinaryTree(preleft, inleft);
       node.rightChild = reConstructBinaryTree( preright, inright);
        return node;
    }
}
