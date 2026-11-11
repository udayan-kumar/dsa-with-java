package src.binary_tree;

import java.util.*;

import src.if_else.integer;

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

        System.out.println(is_balanced(a));

        System.out.println(diameter(a));

        System.out.println(right_view(a));

        System.out.println(left_view(a));

        System.out.println(lowest_common_ancestor(a, 30, 70));
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

    //!FIRST METHOD TO CHECK BALANCED TREE

    // private static boolean is_balanced(Node root){
    //     if(root == null) return true;
    //     int left_levels = levels(root.left);
    //     int right_levels = levels(root.right);
    //     if(Math.abs(left_levels - right_levels) > 1) return false;

    //     return is_balanced(root.left) && is_balanced(root.right);
    // }

    //! SECOND METHOD TO CHECK BALANCED TREE

    static boolean flag;
    private static boolean is_balanced(Node root){
        if(root == null) return true;
        flag = true;
        levels_balanced(root);
        return flag;
    }
    private static int levels_balanced(Node root){
        if(root == null) return 0;

        int left_levels = levels_balanced(root.left);
        int right_levels = levels_balanced(root.right);

        if(Math.abs(left_levels - right_levels) > 1) flag = false;

        return 1 + Math.max(levels_balanced(root.left), levels_balanced(root.right));
    }

    //! FIRST METHOD TO FIND DIAMETER OF BINARY TREE

    // private static int diameter(Node root){
    //     if(root == null) return 0;

    //     int a = levels(root.left) + levels(root.right);
    //     int b = diameter(root.left);
    //     int c = diameter(root.right);
    //     return Math.max(a, Math.max(b, c));
    // }

    //! SECOND METHOD TO FIND DIAMETER OF BINARY TREE

    static int max;
    private static int diameter(Node root){
        max = 0;
        levels_diameter(root);
        return max;
    }
    private static int levels_diameter(Node root){
        if(root == null) return 0;
        int left_levels = levels_diameter(root.left);
        int right_levels = levels_diameter(root.right);
        max = Math.max(max, left_levels + right_levels);

        return 1 + Math.max(levels_diameter(root.left), levels_diameter(root.right));
    }

    public static ArrayList<Integer> right_view(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        view_right(root, 0, ans);
        return ans;
    }
    public static void view_right(Node root, int level, ArrayList<Integer> ans){
        if(root == null) return;
        if(level>=ans.size()) ans.add(root.val);
        else ans.set(level, root.val);
        view_right(root.left, level+1, ans);
        view_right(root.right, level+1, ans);
    }

    public static ArrayList<Integer> left_view(Node root){
        ArrayList <Integer> ans = new ArrayList<>();
        view_left(root, 0, ans);
        return ans;
    }
    public static void view_left(Node root, int level, ArrayList<Integer> ans){
        if(root == null) return;
        if(level >= ans.size()) ans.add(root.val);
        else ans.set(level, root.val);
        view_left(root.right, level+1, ans);
        view_left(root.left, level+1, ans);
    }

    //! FIRST METHOD TO FIND LOWEST COMMON ANCESTOR

    public static int lowest_common_ancestor(Node root, int p, int q){
        if(root == null) return 0;
        if(root.val == p || root.val == q) return root.val;
        boolean p_lies_left = exist(root.left, p);
        boolean q_lies_left = exist(root.right, q);
        if(p_lies_left && q_lies_left) return lowest_common_ancestor(root.left, p, q);
        else if(!p_lies_left && !q_lies_left) return lowest_common_ancestor(root.right
            , p, q);
            else return root.val;
    }
    public static boolean exist(Node root, int val){
        if(root == null) return false;
        if(root.val == val) return true;
        return exist(root.left, val) || exist(root.right, val);
    }

    //! SECOND METHOD TO FIND LOWEST COMMON ANCESTOR

    // public static int lowest_common_ancestor(Node root, int p, int q){
    //     if(root == null) return 0;
    //     if(root.val == p || root.val == q) return root.val;
    //     int l = lowest_common_ancestor(root.left, p, q);
    //     int r = lowest_common_ancestor(root.right, p, q);
    //     if(l != 0 && r != 0) return root.val;
    //     return (l==0) ? r : l;
    // }
}
