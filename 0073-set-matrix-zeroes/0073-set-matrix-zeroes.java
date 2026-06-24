class Solution {
    public void setZeroes(int[][] matrix) {
        
        int ans[][]= new int[matrix.length][matrix[0].length];
        
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                ans[i][j]=matrix[i][j];
            }
         }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(ans[i][j]==0){
                    for(int k=0;k<matrix[i].length;k++){
                        matrix[i][k]=0;
                    }
                    for(int k=0;k<matrix.length;k++){
                        matrix[k][j]=0;
                    }
                }
                
            }
        }
        
    }
}