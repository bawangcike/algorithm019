import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start
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
 * 
 * 解题思路：中序排序顺序为左根右，使用递归方式，先遍历左子树，在合并根节点，在遍历右子数，合并在一起；
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        if(root==null){
            return leftList;

        }      
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        leftList = inorderTraversal(leftNode);
        rightList = inorderTraversal(rightNode);
        leftList.add(root.val);
        leftList.addAll(rightList);
        return leftList;



        
    }
}
// @lc code=end
