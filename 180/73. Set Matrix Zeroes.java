Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
 

Follow up:

A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
  
  solution
  
  brute force 
  
  1. Iterate through the matrix and check if a certain value is 0 , again iterate through the same row and column and change its corresponding value to a unique number . we cannot make it 0 as it can happen some other issues like it can influence other results.
   
   better
   1. take a auxilary row and auxilary column and change  while iterating the values and store zero .
    
    optimal
    1. instead of taking auxilary arrays , try to add the values in the 0th row and oth column.
     2. take a flap for oth row specially
     3. at last iterate from the last and change values .
  
  
  
  
  class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row=matrix.length;
        int col=matrix[0].length;
        int col0=1;
        
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0){
                col0=0;
            }
            
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i=row-1; i>=0;i--){
               
        for(int j=col-1; j>=1;j--){
            if(matrix[i][0]==0 || matrix[0][j]==0){
                matrix[i][j]=0;
            }
         }
            if(col0==0){
                matrix[i][0]=0;
            }
        }
        
    }
}
