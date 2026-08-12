package src.binary_tree;

import java.util.*;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}

class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
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

       invert_binary_tree(a);
       System.out.println();

       System.out.println(is_identical(a, a));

       System.out.println(is_symmetric(a));

       System.out.println(has_path_su(a, 20));

       level_order_traversal(a);

       level_order_linewise(a);

       particular_level(a, 0, 2);
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

    private static void postorder_display(Node root){
        if(root == null) return;

        postorder_display(root.left);
        postorder_display(root.right);
        System.out.print(root.val + " ");
    }

    private static int size(Node root){
        if(root == null) return 0;

        return 1 + size(root.left) + size(root.right);


        // int leftsize = size(root.left);
        // int rightsize = size(root.right);

        // return 1 + leftsize + rightsize;
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

    private static void invert_binary_tree(Node root){
        if(root == null) return;

        // invert_binary_tree(root.right);
        // invert_binary_tree(root.left);

        // System.out.print(root.val + " ");

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert_binary_tree(root.left);
        invert_binary_tree(root.right);
        System.out.print(root.val + " ");

    }

    private static boolean is_identical(Node p, Node q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;

        return is_identical(p.left, q.left) && is_identical(p.right, q.right);
    }

    private static boolean is_symmetric(Node root){
        if(root.left.val == root.right.val) return true;
        if(root.left == null && root.right == null) return true;
        if(root.left.val != root.right.val) return false;

        return is_symmetric(root.left) && is_symmetric(root.right);
    }

    private static boolean has_path_su (Node root, int target_sum){
        if(root==null) return false;
        if(root.left == null && root.right == null){
            if(target_sum == root.val) return true;
            else return false;
        }
        
        return has_path_su(root.left, target_sum-root.val) && has_path_su(root.right, target_sum-root.val);
    }

    private static void level_order_traversal(Node root){
        Queue <Node> q = new LinkedList<>();
        q.add(root);

        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);
        }
        System.out.println();
    }

    private static void level_order_linewise(Node root){
        Queue <Pair> q = new LinkedList<>();
        int currentlevel = 0;
        q.add(new Pair(root, 0));

        while(q.size()>0){
            Pair front = q.remove();
            if(front.level!=currentlevel){
                currentlevel++;
                System.out.println();  // for changing line
            }
            System.out.print(front.node.val + " ");
            if(front.node.left!=null){
                q.add(new Pair(front.node.left, front.level+1));
            }

            if(front.node.right!=null){
                q.add(new Pair(front.node.right, front.level+1));
            }
        }
        System.out.println();
    }

    private static void particular_level(Node root, int level, int k){
        if(root==null) return;
        if(level==k) System.out.print(root.val + " ");

        particular_level(root.left, level+1, k);
        particular_level(root.right, level+1, k);
    }
}
