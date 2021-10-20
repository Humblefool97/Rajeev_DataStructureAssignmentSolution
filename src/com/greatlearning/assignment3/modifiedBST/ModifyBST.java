package com.greatlearning.assignment3.modifiedBST;

public class ModifyBST {

    private Node currentNode = null;
    private Node prevNode = null;

     static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     *  Modified in-order traversal inorder
     *  to create a skewed tree but in increasing
     *  order
     * @param root
     */
    void constructRightSkewedTree(Node root){
         if(root != null){
             constructRightSkewedTree(root.left);
             Node right = root.right;

            if(currentNode == null){
                currentNode = root;
            }else{
                prevNode.right = root;
            }
             root.left = null;
             prevNode = root;

             constructRightSkewedTree(right);
         }
    }

    public Node getSkewedTreeRootNode() {
        return currentNode;
    }


    void printTree(Node root){
         if(root != null){
             System.out.println(root.data);
             printTree(root.right);
         }
    }
}
