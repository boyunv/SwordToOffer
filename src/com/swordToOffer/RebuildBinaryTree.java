package com.swordToOffer;

import sun.reflect.generics.tree.Tree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}

public class RebuildBinaryTree {
    /*
    题目描述
    输入某二叉树的前序遍历和中序遍历的结果，
    请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
    */
    /**
     * 这道题综合考察了对二叉树的前序，中序遍历算法的理解，和根据数组建立二叉树的代码考察以及对递归代码的理解与运用。
     * 题目难度：二星
     * 考察知识：树，递归
     */
    //TODO:本体的关键点->利用前序遍历找到根节点的值所在的位置,利用这个位置分成两部分
    //中序遍历的做部分是前序遍历的中左部分,右部分亦是
    //
    ///**
    // * 关键是：利用前序序列根节点在前找到根节点，用根节点去中序序列划分成两部分，
    // 左部分是左子树，右部分是右子树。再利用子树长度去前序序列把前序序列中的左右子树找出来，
    // 同时可以找出根节点。递归进行此步骤，如果子树长度为0，则不需要生成子问题。
    // */
    public class Solution{
        public TreeNode reConstructionBinaryTree(int[]pre,int[] in){
            TreeNode root=new TreeNode(pre[0]);
            build(root,pre,0,pre.length,in,0,in.length);
            return root;
        }
    }
    /**
     * 递归和二分思想，将问题不断划分，直到问题容易解决。
     * 做法是：对于一个根节点，先去中序序列中找到根节点的值所在位置，利用这个位置分成2部分，
     *          左部分的中序序列长度即为前序序列中左部分的中序序列长度，右部分亦然。
     * 然后开始生成子问题，如果序列长度为0则不需要生成子问题。否则：
     *          利用前序序列第一个元素为根节点的性质生成根节点，然后构造子问题。
     * @param root 根节点
     * @param pre 前序序列 范围是[pleft,pright)
     * @param in 中序序列 范围是[ileft,iright)
     */
    public void build(TreeNode root,int[] pre,int pleft,int pright,int[] in,int ileft,int iright){
        int i;
        for (i= ileft; i < iright; i++) {
            //从中序序列寻找根节点位置
            if(in[i]==root.val){
                break;
            }
        }
        int t=i-ileft;
        //字数长度为0不必生成子问题
        if(t>0){
            root.left=new TreeNode(pre[pleft+1]);
            build(root.left,pre,pleft+1,pleft+1+t,in,ileft,i);
        }
        if(pright-pleft-1-t>0){
            root.right=new TreeNode(pre[pleft+1+t]);
            build(root.right,pre,pleft+1+t,pright,in,i+1,iright);
        }
    }





}
/**
 * import java.util.Arrays;
 * public class Solution {
 *     public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
 *         //数组长度为0的时候要处理
 *         if(pre.length == 0){
 *             return null;
 *         }
 *
 *         int rootVal = pre[0];
 *
 *         //数组长度仅为1的时候就要处理
 *         if(pre.length == 1){
 *             return new TreeNode(rootVal);
 *         }
 *
 *         //我们先找到root所在的位置，确定好前序和中序中左子树和右子树序列的范围
 *         TreeNode root = new TreeNode(rootVal);
 *         int rootIndex = 0;
 *         for(int i=0;i<in.length;i++){
 *             if(rootVal == in[i]){
 *                 rootIndex = i;
 *                 break;
 *             }
 *         }
 *
 *         //递归，假设root的左右子树都已经构建完毕，那么只要将左右子树安到root左右即可
 *         //这里注意Arrays.copyOfRange(int[],start,end)是[)的区间
 *         root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,rootIndex+1),Arrays.copyOfRange(in,0,rootIndex));
 *         root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),Arrays.copyOfRange(in,rootIndex+1,in.length));
 *
 *         return root;
 *     }
 * }
 */
