class SearchIn2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i, j;
        i = 0;
        while(i < matrix.length && target >= matrix[i][0]){
            if(target == matrix[i][0]){
                return true;
            }
            i++;
        }
        if(i != 0){
            i -= 1;
        }
        // System.out.println("i "+i);
        // System.out.println("Len "+ matrix[0].length);
        for(j = 0; j < matrix[i].length; j++){
            // System.out.println("x = " + matrix[i][j]);
            if(matrix[i][j] == target){
                return true;
            }
        }
        return false;
        
    }
}