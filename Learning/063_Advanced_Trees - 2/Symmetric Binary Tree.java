Problem Description

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is the root node of the binary tree.



Output Format
Return 0 / 1 ( 0 for false, 1 for true ).



Example Input
Input 1:

    1
   / \
  2   2
 / \ / \
3  4 4  3
Input 2:

    1
   / \
  2   2
   \   \
   3    3


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 The above binary tree is symmetric. 
Explanation 2:

The above binary tree is not symmetric.




  
  
  /**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int isSymmetric(TreeNode A) {
        
        if(A==null){
            return 1;
        }
        
        boolean res=isEqual(A.left,A.right);
        
        if(res){
            return 1;
        }
        
        return 0;
    }
    
    
    private boolean isEqual(TreeNode left, TreeNode right){
        
        if(left==null && right ==null){
            return true;
        }
        
        if(left==null || right ==null){
            return false;
        }
        
        if(left.val!=right.val){
            return false;
        }
        
        return isEqual(left.left, right.right) && isEqual(left.right, right.left);
    }
}

