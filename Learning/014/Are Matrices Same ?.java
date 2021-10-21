Problem Description

You are given two two matrices A & B of equal sizes and you have to check whether two matrices are equal or not.

NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j in the given range.



Problem Constraints
1 <= A.size(), B.size() <= 1000

1 <= A[i].size(), B[i].size() <= 1000

1 <= A[i][j], B[i][j] <= 1000



Input Format
First argument is vecotor of vector of integers representing matrix A.

Second argument is vecotor of vector of integers representing matrix B.



Output Format
Return 1 if both matrices are equal or return 0.



Example Input
Input 1:

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
B = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
Input 2:

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
B = [[1, 2, 3],[7, 8, 9],[4, 5, 6]]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

==> Clealry all the elements of both matrices are equal at respective postions.
Explanation 2:

==> Clealry all the elements of both matrices are not equal at respective postions.
  
  
  
  
  
  public class Solution {
    public int solve(int[][] A, int[][] B) {
        
        
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]!=B[i][j]){
                    return 0;
                }
            }
        }
        
        return 1;
    }
}
