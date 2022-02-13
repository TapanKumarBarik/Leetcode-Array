Problem Description

Given preorder and inorder traversal of a tree, construct the binary tree.

NOTE: You may assume that duplicates do not exist in the tree.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First argument is an integer array A denoting the preorder traversal of the tree.

Second argument is an integer array B denoting the inorder traversal of the tree.



Output Format
Return the root node of the binary tree.



Example Input
Input 1:

 A = [1, 2, 3]
 B = [2, 1, 3]
Input 2:

 A = [1, 6, 2, 3]
 B = [6, 1, 3, 2]


Example Output
Output 1:

   1
  / \
 2   3
Output 2:

   1  
  / \
 6   2
    /
   3


Example Explanation
Explanation 1:

 Create the binary tree and return the root node of the tree.

   
   
   
   
   
   
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
    
    int preOrderIndex;
    HashMap<Integer,Integer> map;
    
    public TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {
    
    
        preOrderIndex=0;
        map=new HashMap();
        
        for(int i=0;i<inorder.size();i++){
            map.put(inorder.get(i),i);
        }
        return createTree(preorder,0,preorder.size()-1 );
        
    }
    
    private TreeNode createTree(ArrayList<Integer>preorder,int left,int right){
        
        if(left>right){
            return null;
        }
        
        int rootValue=preorder.get(preOrderIndex);
        preOrderIndex++;
        TreeNode root=new TreeNode(rootValue);
        
        root.left=createTree(preorder,left,map.get(rootValue)-1 );
        root.right=createTree(preorder,map.get(rootValue)+1 ,right);
        
        return root;
    }
}
