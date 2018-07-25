import java.util.Scanner;


public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		String s =sc.nextLine();
		int count = 0;
	
		for(int i = 0 ; i<s.length() ;i++){
			String s1 = getShitzif(s, i);
			System.out.println(s1);
			 if(s1.equals(s)){
				 count++;
			 }
			
		}
		
		System.out.println(count);

	}
	public static String  getShitzif(String s , int n){
		int len =s.length();
		 s=s.substring(n,len)+s.substring(0,n);
		return s ;
	}
	}


