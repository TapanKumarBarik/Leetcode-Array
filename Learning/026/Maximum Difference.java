Given an array of integers A and an integer B. Find and return the maximum value of | s1 - s2 |

where s1 = sum of any subset of size B, s2 = sum of elements of A - sum of elemets of s1

Note |x| denotes the absolute value of x.


Input Format

The arguments given are the integer array A and integer B.
Output Format

Return the maximum value of | s1 - s2 |.
Constraints

1 <= B < length of the array <= 100000
1 <= A[i] <= 10^5 
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
    B = 2
Output 1:
    9

Input 2:
    A = [5, 17, 100, 11]
    B = 3
Output 2:
    123

×






public class Solution {
    public int solve(int[] A, int B) {
        
        
        Arrays.sort(A);
        
        int maxBSum=0;
        int minBSum=0;
        int totalSum=0;
        
        
        for(int i=A.length-1;i>A.length-B-1;i--){
            maxBSum+=A[i];
        }
        
        for(int i=0;i<B;i++){
            minBSum+=A[i];
        }
        
        for(int i=0;i<A.length;i++){
            totalSum+=A[i];
        }
        int s1=Math.abs(maxBSum-(totalSum-maxBSum));
        
        int s2= Math.abs(minBSum-(totalSum-minBSum));
        
        return Math.max(s1,s2);
        
    }
}
