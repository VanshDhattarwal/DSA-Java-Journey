class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {

        if(original.length != m*n){
            return new int[0][0];
        }

        int rows = m; 
        int cols = n;

        int[][] matrix = new int[rows][cols];

        int index = 0;

        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                matrix[i][j] = original[index];
                index++;
            }
        } 
        return matrix;
        
    }
}
