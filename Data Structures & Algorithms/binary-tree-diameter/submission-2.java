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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
         heightTree(root);
         return max;
    }

    public int heightTree(TreeNode root){
        if(root == null) return 0;
        int leftMaxDia= heightTree(root.left);
        int rightMaxDia= heightTree(root.right);
        max= Math.max(leftMaxDia+rightMaxDia, max) ;
        return Math.max(leftMaxDia,rightMaxDia)+1;
    }
}
