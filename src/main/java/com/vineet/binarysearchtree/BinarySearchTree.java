package com.vineet.binarysearchtree;


public class BinarySearchTree {

    public  Node insert(Node node,int val){

        if(node == null){
            Node n= new Node();
            n.data=val;
            n.left=null;
            n.right = null;
            return n;
        }

        if(val < node.data){
            node.left = insert(node.left,val);

        } else if(val> node.data){
            node.right = insert(node.right,val);
        }
     return node;
    }

    //case 1 No child
    //case 2 one child
    //case 3 two child (need to find the successor)
    public Node delete(Node node , int val){

        if(node == null){
            return null;
        }

           if(val< node.data){
               node.left = delete(node.left,val);
           } else if(val > node.data){
               node.right = delete(node.right,val);
           } else if(node.left == null || node.right==null){
               Node temp = null ;
               temp = node.left == null ? node.right : node.left;

               if(temp == null){
                   return null;
               }else{
                   return temp;
               }
           } else {
               Node successor = getSuccessor(node);
               node.data=successor.data;
               node.right= delete(node.right,successor.data);
               return node;

           }
       return node;
    }

    public Node getSuccessor(Node node){

        if(node == null){
            return null;
        }

        Node temp = node.right;

        if(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }
}
