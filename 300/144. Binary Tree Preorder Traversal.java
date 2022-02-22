//https://leetcode.com/problems/binary-tree-preorder-traversal/




//Recursive





/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
       
        ArrayList<Integer>arr=new ArrayList();
        
        solve(root,arr);
        
        return arr;
        
    }
    
    private void solve(TreeNode root, ArrayList<Integer>arr){
        
        
        if(root==null)return ;
        
        arr.add(root.val);
        solve(root.left,arr);
        solve(root.right, arr);
    }
}
