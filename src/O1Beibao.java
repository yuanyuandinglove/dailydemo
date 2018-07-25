
public class O1Beibao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10 ;
		int w[]={2,3,5,1,7};
		int n = w.length;
		int v[]={4,3,5,4,7};
   
       
               // TODO Auto-generated method stub  
              // int[] weight = {3,5,2,6,4}; //物品重量  
             //  int[] val = {4,4,3,5,3}; //物品价值  
            //   int k = 12; //背包容量  
            //   int l = val.length; //物品个数  
                 
               int[][] f = new int[n+1][m+1]; //f[i][j]表示前i个物品能装入容量为j的背包中的最大价值  
               int[][] path = new int[n+1][m+1];  
               //初始化第一列和第一行  
               for(int i=0;i<f.length;i++){  
                   f[i][0] = 0;  
               }  
               for(int i=0;i<f[0].length;i++){  
                   f[0][i] = 0;  
               }  
               //通过公式迭代计算  
               for(int i=1;i<f.length;i++){  
                   for(int j=1;j<f[0].length;j++){  
                       if(w[i-1]>j)  
                           f[i][j] = f[i-1][j];  
                       else{  
                           if(f[i-1][j]<f[i-1][j-w[i-1]]+v[i-1]){  
                               f[i][j] = f[i-1][j-w[i-1]]+v[i-1];  
                               path[i][j] = 1;  
                           }else{  
                               f[i][j] = f[i-1][j];  
                           }  
                           //f[i][j] = Math.max(f[i-1][j], f[i-1][j-weight[i-1]]+val[i-1]);  
                       }  
                   }  
               }  
               for(int i=0;i<f.length;i++){  
                   for(int j=0;j<f[0].length;j++){  
                       System.out.print(f[i][j]+" ");  
                   }  
                   System.out.println();  
               }  
                 
               int i=f.length-1;  
               int j=f[0].length-1;  
               while(i>0&&j>0){  
                   if(path[i][j] == 1){  
                       System.out.print("第"+i+"个物品装入 ");  
                       j -= w[i-1];  
                   }  
                   i--;  
               }  
                 
           }  
         
        

	
	/**n是物品个数长度
	 * m 是背包的能承受的总种量
	 * w[]是中联数组
	 * v[]是价值数组
	 * @param m
	 * @param p
	 * @param w
	 * @param v
	 * @return
	 */
	/*public static int [][]getVlaus(int m , int n , int w[],int v[]  ){
		int c[][] = new int[n+1][m+1];
		for(int i = 0;i < n+1 ;i++){
			c[i][0]=0;
			
		}
		for(int j = 0;j< m+1 ;j++){
			c[0][j]=0;
			
		}
		for(int i = 1 ; i < n+1 ;i++){
			for(int j = 1 ; j < m+1 ;j++){
				if(w[i-1]<j){
					if(c[i-1][j] < c[i-1][j-w[i-1]]+v[i]){
						
						c[i][j] =c[i-1][j-w[i-1]]+v[i];
					}else{
						c[i][j] =c[i-1][j];
					}
				}else{
					c[i][j]=c[i-1][j];
				}
			}
		}
		 return c;
	}
   */
}
