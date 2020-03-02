package com.vineet.binarysearchtree;


public class BstApp {

    public static void main(String[] args) {

        Node root = null;
        // 8,3,6,10,4,7,1,14,13
        BinarySearchTree bst = new BinarySearchTree();
         root = bst.insert(root,8);
         root = bst.insert(root,3);
         root = bst.insert(root,6);
         root = bst.insert(root,10);
         root = bst.insert(root,4);
         root = bst.insert(root,7);
         root = bst.insert(root,1);
         root = bst.insert(root,14);
         root = bst.insert(root,13);



        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);
        System.out.println(root.left.right.left.data);
        System.out.println(root.left.right.right.data);

        System.out.println("=============================================");

        root = bst.delete(root,6);

        System.out.println();

    }
}
