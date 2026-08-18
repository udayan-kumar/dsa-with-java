package src.binary_tree;

import java.util.*;
import java.util.stream.Gatherer.Integrator;

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
       System.out.println();

       System.out.println(paths(a));

       System.out.println(is_balanced_node(a));
       
       System.out.println(diameter(a));

       System.out.println(right_view(a));

       System.out.println(left_view(a));

       Node ans = lowest_common_ancestor(a, 5, 6);
       System.out.println(ans.val);
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

    public static ArrayList<ArrayList<Integer>> paths(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        dfs(root, new ArrayList<>(), ans);
        return ans;
    }

    private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans){
        if(root == null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(arr);
            ans.add(list);
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        dfs(root.left, arr, ans);
        dfs(root.right, arr, ans);
        arr.remove(arr.size()-1);
    }

    static boolean flag;
    public static boolean is_balanced_node(Node root){
        // if(root == null) return true;
        // int leftlevels = level(root.left);
        // int rightlevels = levels(root.right);

        // if(Math.abs(leftlevels-rightlevels)>1) return false;

        // return is_balanced_node(root.left) && is_balanced_node(root.right);


        if(root == null) return true;
        flag = true;
        levels_balanced(root);
        return flag;
    }

    private static int levels_balanced(Node root){
        if(root == null) return 0;
        int leftlevels = level(root.left);
        int rightlevels = level(root.right);

        if(Math.abs(leftlevels-rightlevels)>1) flag = false;

        return 1 + Math.max(leftlevels, rightlevels);
    }
    
    static int max;
    private static int diameter(Node root){
        //return level(root.left) + level(root.right);


        max = 0; 
        level_diameter(root);
        return max;
    }

    private static int level_diameter(Node root){
        if(root == null) return 0;
        int leftlevels = level_diameter(root.left);
        int rightlevels = level_diameter(root.right);

        max = Math.max(max, leftlevels + rightlevels);

        return 1 + Math.max(leftlevels,rightlevels);
    }

    public static ArrayList<Integer> right_view(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        view(root,0,ans);
        return ans;
    }

    private static void view(Node root,int level,ArrayList<Integer> ans){
        if(root == null) return;
        if(level>=ans.size()) ans.add(root.val);
        else ans.set(level, root.val);
        view(root.left, level+1, ans);
        view(root.right, level+1, ans);
    }

    public static ArrayList<Integer> left_view(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        view_left(root,0,ans);
        return ans;
    }

    private static void view_left(Node root, int level,ArrayList<Integer> ans){
        if(root == null) return;
        if(level>=ans.size()) ans.add(root.val);
        else ans.set(level, root.val);
        view_left(root.right,level+1,ans);
        view_left(root.left,level+1,ans);
    }

    private static Node lowest_common_ancestor(Node root, int p, int q){
        if(root == null) return null;
        if(root.val==p || root.val==q) return root;
        boolean pliesinleft = exist(root.left,p);
        boolean qliesinleft = exist(root.left,q);
        if(pliesinleft && qliesinleft) return lowest_common_ancestor(root.left, p, q);
        else if(!pliesinleft && !qliesinleft) return lowest_common_ancestor(root.right, p, q);
        else return root;
    }

    private static boolean exist(Node root, int value){
        if(root == null) return false;
        if(root.val==value) return true;
        return exist(root.left, value) || exist(root.right, value);
    }

}
1:30