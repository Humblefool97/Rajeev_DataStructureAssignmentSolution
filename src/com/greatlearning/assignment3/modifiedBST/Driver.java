package com.greatlearning.assignment3.modifiedBST;

public class Driver {
    public static void main(String[] args) {
        ModifyBST instanse = new ModifyBST();

        ModifyBST.Node node = new ModifyBST.Node(50);
        node.left = new ModifyBST.Node(30);
        node.right = new ModifyBST.Node(60);
        node.left.left = new ModifyBST.Node(10);
        node.left.right = new ModifyBST.Node(40);

        instanse.constructRightSkewedTree(node);
        instanse.printTree(instanse.getSkewedTreeRootNode());
    }
}
