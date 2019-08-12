package org.rk.java.knowledge.collect;

/**
 * @author rongkai
 * @date 2019/8/8 15:33
 */
public class TreeNodeCollect {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        TreeNode base=new TreeNode(1);
        TreeNode temp=base;
        base.left=new TreeNode(2);
        base=base.left;
        System.out.println(temp==base);
    }
}
