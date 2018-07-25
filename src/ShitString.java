import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class ShitString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new Scanner(System.in).nextLine();
		   StringBuffer sb = new StringBuffer();
		   int count = 0 ;
		  
		   
		 for(int i = 0 ; i<s.length();i++){
			 sb.append(s);
		     sb.delete(0, i).append(s.substring(0,i));
		     if(sb.toString().equals(s)){
		    	 count++;
		     }
		     sb.delete(0, s.length());
		   }
		 
		   System.out.println(count);
		
	}
	public boolean Find(int target, int [][] array) {
        int hang = array.length;
        int lie = array[0].length;
        int i = hang -1 ;
        int j  = 0;
        while(i > 0 && j < lie){
         
            if(target == array[i][j]){
                return true;
            }
            if(target > array[i][j]){
                j++;
                continue;
               
                
            }
             if(target < array[i][j]){
                i--;
                continue;
                
            }
            
        }
       
     return false;
    }
	 
}

