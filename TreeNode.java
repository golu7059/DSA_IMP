import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    public static void main(String[] args) {
        // Creating a binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        // Creating an instance of Solution class
        Solution solution = new Solution();
        
        // Calling levelOrder method to perform level order traversal
        List<List<Integer>> result = solution.levelOrder(root);
        
        // Printing the result
        // for (List<Integer> level : result) {
        //     System.out.println(level);
        // }

        System.out.println(result);   // return in the form of the arraylist
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        pre(root, 0, al);
        return al;
    }
    
    public static void pre(TreeNode root, int l, List<List<Integer>> al) {
        if (root == null)
            return;
        if (al.size() == l) {
            List<Integer> li = new ArrayList<>();
            li.add(root.val);
            al.add(li);
        } else
            al.get(l).add(root.val);
        pre(root.left, l + 1, al);
        pre(root.right, l + 1, al);
    }
}
