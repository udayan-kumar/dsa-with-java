package src.binary_tree;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}

public class revision_implemenatation {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        display(a);
        System.out.println();

        System.out.println(size(a));

        System.out.println(sum_binarytree(a));

        System.out.println(product_binarytree(a));

        System.out.println(max(a));

        System.out.println(min(a));

        System.out.println(levels(a));
    }

    private static void display(Node root){
        if(root == null) return;

        System.out.print(root.val + " ");

        display(root.left);
        display(root.right);
    }

    private static int size(Node root){
        if(root == null) return 0;

        //return 1 + size(root.left) + size(root.right);

        //return (root == null) ? 0 : 1 + size(root.left) + size(root.right);

        int leftsize = size(root.left);
        int rightsize = size(root.right);

        return 1 + leftsize + rightsize;
    }

    private static int sum_binarytree(Node root){
        if(root == null) return 0;

       return root.val + sum_binarytree(root.left) + sum_binarytree(root.right);
    }

    private static long product_binarytree(Node root){
        if(root == null) return 1;

        return root.val * product_binarytree(root.left) * product_binarytree(root.right);
    }

    private static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;

        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    private static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;

        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

    private static int levels(Node root){
        if(root == null) return 0;

        return 1 + Math.max(levels(root.left), levels(root.right));
    }
}
