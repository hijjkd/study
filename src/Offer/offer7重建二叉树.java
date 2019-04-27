package Offer;

import leetcode.TreeNode;

public class offer7重建二叉树 {


    private static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        return ConstructCore(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    //重构二叉树核心代码核心代码
    private static TreeNode ConstructCore(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) {
        //通过前序遍历序列找到根节点，很显然是序列第一个值
        //创建根节点
        TreeNode root = new TreeNode(pre[preStart]);
        root.left = null;
        root.right = null;
        //当遇到特殊情况
        if (preStart == preEnd && inStart == inEnd) {
            return root;
        } else {
            //throw new Exception();
            System.err.println("输入错误！");
        }
        //通过前序遍历序列所得到的根节点在中序遍历根节点的位置
        int rootInorder;
        for (rootInorder = inStart; rootInorder <= inEnd; rootInorder++) {
            if (in[rootInorder] == pre[preStart])
                break;
            else if (rootInorder == inEnd) {
                System.err.println("输入错误");
            }
        }

        //开始分割左右子树
        //左子树长度
        int leftTreeLength = rootInorder - inStart;
        //右子树长度
        int rightTreelength = inEnd - rootInorder;
        //开始构建左右子树
        //构建左子树
        if (leftTreeLength > 0) {
            root.left = ConstructCore(pre, in,
                    preStart + 1, preStart + leftTreeLength,
                    inStart, rootInorder - 1);
        }
        //构建右子树
        if (rightTreelength > 0) {
            root.right = ConstructCore(pre, in,
                    preStart + leftTreeLength + 1, preEnd,
                    rootInorder + 1, inEnd);
        }
        return root;
    }

    public static void main(String[] args) {

        int[] pre = new int[]{1,2,3};
        int[] in = new int[]{2,1,3};

        TreeNode treeNode = reConstructBinaryTree(pre,in);

    }
}
