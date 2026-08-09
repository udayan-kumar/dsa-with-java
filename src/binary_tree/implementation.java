package src.binary_tree;

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

       display(a);
       System.out.println();

       System.out.println(size(a));
    }

    private static void display(Node root){
        if(root == null) return;

        System.out.print(root.val + " ");
        display(root.left);  // left ki sari value print kar dega
        display(root.right);  // right ki sari value print kar dega
    }

    private static int size(Node root){
        if(root == null) return 0;

        //return 1 + size(root.left) + size(root.right);


        int leftsize = size(root.left);
        int rightsize = size(root.right);

        return 1 + leftsize + rightsize;
    }
}
