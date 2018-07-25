package thisone;

import java.util.ArrayList;

public class Two {
    public static void main(String []args){
    	int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    			
    	
    	  ArrayList<Integer> list = new Two().printMatrix(m);
    	  System.out.println(list.size());
    	  for(int i = 0;i<list.size() ;i++){
    		  System.out.println(list.get(i));
    	  }
    }
	public ArrayList<Integer> printMatrix(int[][] matrix) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		int hang = matrix.length;

		int lie = matrix[0].length;
		System.out.println(hang+"_"+lie);

		int temp[][] = new int[hang][lie];

		int i = 0;

		int j = 0;

		while (!isFinsh(temp)) {

			while (j < lie && temp[i][j] == 0) {

				list.add(matrix[i][j]);

				temp[i][j] = 1;
				j++;

			}

			j--;

			i++;

			while (i < hang && temp[i][j] == 0) {

				list.add(matrix[i][j]);

				temp[i][j] = 1;

			}

			i--;

			j--;

			while (j >= 0 && temp[i][j] == 0) {

				list.add(matrix[i][j]);

				temp[i][j] = 1;

				j--;

			}

			j++;

			i--;

			while (i >= 0 && temp[i][j] == 0) {

				list.add(matrix[i][j]);

				temp[i][j] = 1;

				i--;

			}

			j++;

			i=i+1;

		}

		return list;

	}

	public boolean isFinsh(int[][] temp) {
		int hang1 = temp.length;

		int lie1 = temp[0].length;

		for (int i = 0; i < hang1; i++) {

			for (int j = 0; j < lie1; j++) {

				if (temp[i][j] == 0) {

					return false;

				}

			}

		}

		return true;

	}

}