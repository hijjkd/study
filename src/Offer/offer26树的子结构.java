package Offer;

import leetcode.TreeNode;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class offer26树的子结构 {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        //如果root1和root2都不为空，比较两个是否是子结构，否则直接返回false
        if(root1!=null && root2!=null){
            //如果根节点相等
            if(root1.val == root2.val){
                //判断这个根节点起，是否含有root2
                result = doseTree1HaveTree2(root1,root2);
            }
            //如果根节点不等，寻找root1的左子节点，再进行HasSubTree比较
            if(!result){
                result = HasSubtree(root1.left,root2);

            }

            //如果左子节不等，寻找root1的右子节点，再进行HasSubTree比较
            if(!result){
                result = HasSubtree(root1.right,root2);
            }
        }
        return result;

    }

    private boolean doseTree1HaveTree2(TreeNode root1, TreeNode root2) {
        //如果root2已经为空，说明已经遍历完了，root1包含root2
        if(root2 ==null)
            return true;
        //如果root1为空，说明未遍历完，root1已经空了，返回false
        if(root1 ==null)
            return false;

        //如果不为空，但是值不相等，返回false
        if(root1.val != root2.val)
            return false;

        //如果根节点对应的上，那么就分别去子节点里面匹配
        return doseTree1HaveTree2(root1.left,root2.left)&&doseTree1HaveTree2(root1.right,root2.right);
    }
}
