package Lab1;

public class MatrixMultiply {

	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	        };
	        
	        int[][] matrix2 = {
	            {7, 8},
	            {9, 10},
	            {11, 12}
	        };
	        
	        int rows1 = matrix1.length;
	        int cols1 = matrix1[0].length;
	        int cols2 = matrix2[0].length;
	        
	        System.out.println("rows1 " + rows1);
	        System.out.println("cols1 " + cols1);
	        System.out.println("cols2 " + cols2);
	        
	        int[][] result = new int[rows1][cols2];

	        
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                for (int k = 0; k < cols1; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
	        
	        int rows = result.length;
	        int cols = result[0].length;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}
