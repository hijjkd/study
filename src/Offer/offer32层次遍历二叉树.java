package Offer;

import java.util.ArrayList;

public class offer32层次遍历二叉树 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();//输出list
        ArrayList<TreeNode> queue = new ArrayList<>();//模拟队列
        if (root == null) {
            return list;
        }
        queue.add(root);//不等于把root入队列
        while (queue.size() != 0) {
            TreeNode temp = queue.remove(0);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;

    }

    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
}
