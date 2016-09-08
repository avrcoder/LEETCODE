/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        TreeNode node = root;
        while(node!=null){
            if(node.left!=null){
                TreeNode nxtrt = node.left;
                while(nxtrt.right!=null){
                    nxtrt = nxtrt.right;
                }
                nxtrt.right = node.right;
                node.right = node.left;
                node.left = null;
            }
            node = node.right;
        }
    }
}
