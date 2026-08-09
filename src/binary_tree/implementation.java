package src.binary_tree;

import src.two_D_array.sum;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}
public class implementation {
    public static void main(String[] args) {
       Node a = new Node(1);  // root
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(4);
       Node e = new Node(5);
       Node f = new Node(6);
       Node g = new Node(7);
       Node h = new Node(8);
       Node i = new Node(9);

       a.left = b; a.right = c;
       b.left = d; b.right = e;
       c.left = f; c.right = g;
       d.left = h; d.right = i;

       preorder_display(a);
       System.out.println();

       inorder_display(a);
       System.out.println();

       postorder_display(a);
       System.out.println();

       System.out.println(size(a));

       System.out.println(sum(a));

       System.out.println(product(a));

       System.out.println(max(a));

       System.out.println(min(a));

       System.out.println(level(a));
    }

    private static void preorder_display(Node root){
        if(root == null) return;

        System.out.print(root.val + " ");
        preorder_display(root.left);  // left ki sari value print kar dega
        preorder_display(root.right);  // right ki sari value print kar dega
    }

    private static void inorder_display(Node root){
        if(root == null) return;

        inorder_display(root.left);
        System.out.print(root.val + " ");
        inorder_display(root.right);
    }

   

    private static int size(Node root){
        if(root == null) return 0;

        //return 1 + size(root.left) + size(root.right);


        int leftsize = size(root.left);
        int rightsize = size(root.right);

        return 1 + leftsize + rightsize;
    }

    private static int sum(Node root){
        if(root ==  null) return 0;

        return root.val + sum(root.left) + sum(root.right);
    }

    private static int product(Node root){
        if(root == null) return 1;

        return root.val * product(root.left) * product(root.right);
    }

    private static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;

        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    private static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;

        return Math.min(root.val,Math.min(min(root.left), min(root.right)));
    }

    private static int level(Node root){
        if(root == null) return 0;

        return 1 + Math.max(level(root.left), level(root.right));
    }
}
