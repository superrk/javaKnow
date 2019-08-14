package org.rk.java.knowledge.collect;

import java.util.Stack;

/**
 * @author rongkai
 * @date 2019/8/8 15:33
 */
public class TreeNodeCollect {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode base = new TreeNode(1);
        TreeNode temp = base;
        base.left = new TreeNode(2);
        base.right = new TreeNode(3);
        base = base.left;
        base.left = new TreeNode(4);
        base.right = new TreeNode(5);
        frontTreeStack(temp);
        System.out.println();
        houxuFeiDigui(temp);
    }

    public static void frontTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.print(treeNode.val);
        frontTree(treeNode.left);
        frontTree(treeNode.right);
    }

    public static void frontTreeStack(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode != null || !stack.isEmpty()) {
            while (treeNode != null) {
                System.out.print(treeNode.val);
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            if (!stack.isEmpty()) {
                treeNode = stack.pop();
                treeNode = treeNode.right;
            }
        }
    }

    public static void houxuFeiDigui(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode != null || !stack.isEmpty()) {
            while (treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            boolean tag = true;
            TreeNode preNode = null;  // 前驱节点
            while (!stack.isEmpty() && tag == true) {
                treeNode = stack.peek();
                if (treeNode.right == preNode) { // 之前访问的为空节点或是栈顶节点的右子节点
                    treeNode = stack.pop();
                    System.out.print(treeNode.val);
                    if (stack.isEmpty()) {
                        return;
                    } else {
                        preNode = treeNode;
                    }
                } else {
                    treeNode = treeNode.right;
                    tag = false;
                }
            }
        }
    }
}
