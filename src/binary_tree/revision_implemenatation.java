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

        preorder(a);
        System.out.println();

        inorder(a);
        System.out.println();

        postorder(a);
        System.out.println();

        mirror_tree(a);
        System.out.println();

        System.out.println(is_identical(a, a));

        System.out.println(is_symmetric(a));

        System.out.println(has_path_sum(a, 100));

        level_order_traverse(a);

        level_order_linebise(a);

        kth_level(a, 0, 2);
        // for(int i = 0; i<levels(a); i++){
        //     kth_level(a, 0, i);
        //     System.out.println();
        // }
        System.out.println();

        System.out.println(path(a));
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

    private static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    private static void postorder(Node root){
        if(root == null) return;

        postorder(root.left);
        preorder(root.right);
        System.out.print(root.val + " ");
    }

    private static void mirror_tree(Node root){
        if(root == null) return;

        System.out.print(root.val + " ");
        mirror_tree(root.right);
        mirror_tree(root.left);

        //PREORDER MIRROR 
        // Node temp = root.left;
        // root.left = root.right;
        // root.right = temp;

        // mirror_tree(root.left);
        // mirror_tree(root.right);

        //POSTORDER MIRROR
        // mirror_tree(root.left);
        // mirror_tree(root.right);

        // Node temp = root.left;
        // root.left = root.right;
        // root.right = temp;

        //INORDER MIRROR
        // mirror_tree(root.left);

        // Node temp = root.left;
        // root.left = root.right;
        // root.right = temp;

        // mirror_tree(root.left);
    }

    private static boolean is_identical(Node p, Node q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;

        return is_identical(p.left, q.left) && is_identical(p.right, p.right);
    }

    private static boolean is_symmetric(Node root){
        if(root.left.val == root.right.val) return true;
        if(root.left == null && root.right == null) return true;
        if(root.left.val != root.right.val) return false;

        return is_symmetric(root.left) && is_symmetric(root.right);
    }

    private static boolean has_path_sum(Node root, int target_sum){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            if(target_sum == root.val) return true;
            else return false;
        }

        return has_path_sum(root.left, target_sum-root.val) || has_path_sum(root.right, target_sum-root.val);
    }

    private static void level_order_traverse(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }
        System.out.println();
    }

    private static void level_order_linebise(Node root){
        Queue <Pair> q = new LinkedList<>();
        int curr_level = 0;
        q.add(new Pair(root, 0));

        while(q.size()>0){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;

            if(front.level != curr_level){
                curr_level++;
                System.out.println();
            }

            System.out.print(front.node.val + " ");
            if(node.left != null) q.add(new Pair(node.left, level+1));
            if(node.right != null) q.add(new Pair(node.right, level+1));
        }
        System.out.println();
    }

    private static void kth_level(Node root, int level, int k){
        if(root == null) return;

        if(level == k) System.out.print(root.val + " ");
        kth_level(root.left, level+1, k);
        kth_level(root.right, level+1, k);
    }

    private static ArrayList<ArrayList<Integer>>path(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, arr, ans);
        return ans;
    }
    private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans){
        if(root == null) return;
        arr.add(root.val);
        if(root.left == null && root.right == null){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(arr);
            ans.add(list);
        }
        dfs(root.left, arr, ans);
        dfs(root.right, arr, ans);
        arr.remove(arr.size()-1);  // backtracking
    }
}
