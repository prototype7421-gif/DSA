class Solution {
    public void setZeroes(int[][] matrix) {
       int m= matrix.length;
       int n = matrix[0].length; 
       int []rowchecker = new int[m];
       int []colchecker= new int [n];
       for( int i =0;i<m;i++){
         for( int j =0;j<n;j++){
            if(matrix[i][j]==0){
                 rowchecker[i] =1;
                 colchecker[j] =1;
              }
       }
    }
    for( int i =0;i<m;i++){
        for( int j =0;j<n;j++){
            if(rowchecker[i] ==1 || colchecker[j] == 1){
                 matrix[i][j]=0;
            }
        }
    }
}
}