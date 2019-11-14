// Problem 94
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<TreeNode>(); 
        ArrayList<Integer> inOrder = new ArrayList<Integer>(); 
        
        TreeNode curr = root; 
        

        /* Technically you only want to keep going left and adding to the stack while curr !=null 
           But you want to continue the function while the !stack.isEmpty()
           The problem is the stack is empty to begin with, however we should still keep going since we haven't reached the end of the tree  */

        while(curr!= null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;      
            }
            
            curr = stack.pop();
            inOrder.add(curr.val);
            curr = curr.right; 
            
        }
        
        return inOrder; 
        
    }
}