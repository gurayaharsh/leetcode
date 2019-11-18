// Problem 199 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        ArrayList<Integer> rightView = new ArrayList<Integer>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        
         
        if(root == null){
            return rightView;
        }
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode curr = queue.remove();
                if(i == size-1){
                     rightView.add(curr.val);
                }
                if(curr.left != null){queue.add(curr.left);}
                if(curr.right != null){queue.add(curr.right);}
            }
        }
        
        return rightView;
    
 
    }
}