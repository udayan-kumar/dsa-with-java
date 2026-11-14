package src.binary_search_tree;

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
    int max;
    int min;

    Pair(int max, int min){
        this.max = max;
        this.min = min;
    }
}

class Quad{
    int max;
    int min;
    int size;
    boolean is_bst;

    Quad(int max, int min, int size, boolean is_bst){
        this.max = max;
        this.min = min;
        this.size = size;
        this.is_bst = is_bst;
    }
}

class Quad_all{
    int max;
    int min;
    int size;
    int sum;

    Quad_all(int max, int min, int size, int sum){
        this.max = max;
        this.min = min;
        this.size = size;
        this.sum = sum;
    }

    void display(){
        System.out.println(max + " " + min + " " + size + " " + sum);
    }

    void display_flatten(Node root){
        System.out.print(root.val + " ");
    }
}

public class implementation_binary_search_tree {
    public static void main(String[] args) {
        Node a = new Node(9);
        Node b = new Node(3);
        Node c = new Node(11);
        Node d = new Node(2);
        Node e = new Node(5);
        Node f = new Node(8);
        Node g = new Node(10);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = g;
        e.right = f;

        // System.out.println(min(a));

        // System.out.println(max(a));

        // System.out.println(searching(a, 8));

        // System.out.println(range(a, 2, 10));

        //System.out.println(insert(a, 20));

        // System.out.println(kth_smallest(a, 3));

        // System.out.println(is_bst(a));

        // System.out.println(lowest_common_ancestor_bst(a, 8, 5));

        // transform_tree(a);
        // System.out.println();

        // int[] arr = {1,2,3,4,5,6,7};
        // System.out.println(sorted_array(arr));

        // System.out.println(is_bst_max_min(a));

        // System.out.println(largest_bst(a));

        //max_min_size_sum(a).display();

        System.out.println(morris_inorder_traverse(a));

        System.out.println(morris_is_bst(a));

        morris_flatten_binary_linkedlist(a);
    }

    public static int min(Node root){
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp.val;
    }

    public static int max(Node root){
        Node temp = root;
        while(temp.right != null){
            temp = temp.right;
        }
        return temp.val;
    }

    public static boolean searching(Node root, int target){
        if(root == null) return false;

        if(root.val == target) return true;

        if(root.val > target) return searching(root.left, target);
        else return searching(root.right, target);
    }

    public static int range(Node root, int min, int max){
        if(root == null) return 0;
        if(root.val < min) return range(root.right, min, max);
        else if(root.val > max) return range(root.left, min, max);
        else 
            return 1 + range(root.left, min, max) + range(root.right, min, max);
    }

    public static void insert(Node root, int key){
        if(root == null) return;
        if(root.val == key) return;
        if(root.val < key){
            if(root.right == null) root.right = new Node(key);
            else insert(root.right, key);
        }
        else{
            if(root.left == null) root.left = new Node(key);
            else insert(root.left, key);
        }
    }

    public static int kth_smallest(Node root, int index){
        if(root == null) return 0;
        ArrayList<Integer> arr = new ArrayList<>();

        inorder_smallest(root, arr);
        return arr.get(index - 1);
    }
    public static void inorder_smallest(Node root, ArrayList<Integer> arr){
        if(root == null) return;

        inorder_smallest(root.left, arr);
        arr.add(root.val);
        inorder_smallest(root.right, arr);
    }

    public static boolean is_bst(Node root){
        ArrayList <Integer> ans = new ArrayList<>();

        inorder_bst(root, ans);

        int i = 0;
        while(ans.size()-1>i){
            if(ans.get(i)>=ans.get(i+1)) return false;
            i++;
        }
        return true;
    }
    public static void inorder_bst(Node root, ArrayList<Integer> ans){
        if(root == null) return;

        inorder_bst(root.left, ans);
        ans.add(root.val);
        inorder_bst(root.right, ans);
    }

    public static int lowest_common_ancestor_bst(Node root, int p, int q){
        if(root.val > p && root.val > q) return lowest_common_ancestor_bst(root.left, p, q);
        if(root.val < p && root.val < q) return lowest_common_ancestor_bst(root.right, p, q);
        else return root.val;
    }

    //! FIRST METHOD TO TRANSFORM BINARY SEARCH BINARY TREE

    // public static void transform_tree(Node root){
    //     ArrayList<Node> arr = new ArrayList<>();
    //     reversre_inorder_transform(root, arr);
    //     int sum = 0;
    //     for(int i = 0; i<arr.size(); i++){
    //         int value = arr.get(i).val;
    //         arr.get(i).val = sum;
    //         sum += value;
    //         System.out.print(sum + " ");
    //     }
        
    // }
    // public static void reversre_inorder_transform(Node root, ArrayList<Node> arr){
    //     if(root == null) return;

    //     reversre_inorder_transform(root.right, arr);
    //     arr.add(root);
    //     reversre_inorder_transform(root.left, arr);
    // }

    //! SECOND METHOD TO TRANSFORM BINARY SEARCH TREE

    static int sum;
    public static void transform_tree(Node root){
        sum = 0;
        reverse_inorder_transform(root);
    }
    public static void reverse_inorder_transform(Node root){
        if(root == null) return;

        reverse_inorder_transform(root.right);
        int value = root.val;
        root.val = sum;
        sum += value;
        System.out.print(sum + " ");
        reverse_inorder_transform(root.left);
    }

    public static Node sorted_array(int[] arr){
        int n = arr.length;

        return convert(arr, 0, n-1);
    }
    public static Node convert(int[] arr, int low, int high){
        if(low > high) return null;
        int mid = (low + high)/2;
        Node root = new Node(arr[mid]);
        root.left = convert(arr, low, mid-1);
        root.right = convert(arr, mid+1, high);
        return root;
    }

    static boolean flag;
    public static boolean is_bst_max_min(Node root){
        flag = true;
        max_min(root);
        return flag;
    }
    public static Pair max_min(Node root){
        if(root == null) return new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE);

        Pair left_sub_tree = max_min(root.left);
        Pair right_sub_tree = max_min(root.right);

        int max = Math.max(root.val, Math.max(left_sub_tree.max, right_sub_tree.max));
        int min = Math.min(root.val, Math.min(left_sub_tree.min, right_sub_tree.min));

        if(left_sub_tree.max >= root.val || right_sub_tree.min <= root.val){
            flag = false;
        }

        return new Pair(max, min);
    }

    static int max_size;
    public static int largest_bst(Node root){
        max_size = 0;
        helper(root);
        return max_size;
    }
    public static Quad helper(Node root){
        if(root == null) return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);

        Quad left_sub_tree = helper(root.left);
        Quad right_sub_tree = helper(root.right);

        int max = Math.max(root.val, Math.max(left_sub_tree.max, right_sub_tree.max));
        int min = Math.min(root.val, Math.min(left_sub_tree.min, right_sub_tree.min));
        int size = 1 + left_sub_tree.size + right_sub_tree.size;
        boolean is_bst = left_sub_tree.is_bst && right_sub_tree.is_bst && (left_sub_tree.max < root.val) && (right_sub_tree.min > root.val);
        if(is_bst) max_size = Math.max(size, max_size);
        return new Quad(max, min, size, is_bst);
    }

    public static Quad_all max_min_size_sum(Node root){
        if(root == null) return new Quad_all(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);

        Quad_all left_sub_tree = max_min_size_sum(root.left); 
        Quad_all right_sub_tree = max_min_size_sum(root.right);

        int max = Math.max(root.val, Math.max(left_sub_tree.max, right_sub_tree.max));
        int min = Math.min(root.val, Math.min(left_sub_tree.min, right_sub_tree.min));
        int size = 1 + left_sub_tree.size + right_sub_tree.size;
        int sum = root.val + left_sub_tree.sum + right_sub_tree.sum;
        
        return new Quad_all(max, min, size, sum);
    }

    public static ArrayList<Integer> morris_inorder_traverse(Node root){
        ArrayList <Integer> arr = new ArrayList<>();
        Node curr = root;
        while(curr != null){
            if(curr.left != null){
                Node predecissor = curr.left;
                while(predecissor.right != null && predecissor.right != curr){
                    predecissor = predecissor.right;
                }
                if(predecissor.right == null){
                    predecissor.right = curr;
                    curr = curr.left;
                }
                else{
                    predecissor.right = null;
                    arr.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                arr.add(curr.val);
                curr = curr.right;
            }
        }
        return arr;
    }

    public static boolean morris_is_bst(Node root){
        Node curr = root;
        int previous = 0;
        while(curr != null){
            if(curr.left != null){
                Node predecissor = curr.left;
                while(predecissor.right != null && predecissor.right != curr){
                    predecissor = predecissor.right;
                }
                if(predecissor.right == null){
                    predecissor.right = curr;
                    curr = curr.left;
                }
                else{
                    predecissor.right = null;
                    if(curr.val <= previous) return false;
                    previous = curr.val;
                    curr = curr.right;
                }
            }
            else{
                if(curr.val <= previous) return false;
                previous = curr.val;
                curr = curr.right;
            }
        }
        return true;
    }

    public static void morris_flatten_binary_linkedlist(Node root){
        if(root == null) return;
        Node curr = root;
        while(curr != null){
            if(curr.left != null){
                Node predecessor = curr.left;
            while(curr.right != null) predecessor = predecessor.right;
            
            predecessor.right = curr.right;
            curr.right = curr.left;
            curr.left = null;
            }
            curr = curr.right;
        }
    }
}
