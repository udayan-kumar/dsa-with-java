package src.binary_search_tree;

import java.util.ArrayList;

import src.recursion.function_calling_itshelf;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
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

        System.out.println(min(a));

        System.out.println(max(a));

        System.out.println(searching(a, 8));

        System.out.println(range(a, 2, 10));
    }

    private static int min(Node root){
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp.val;
    }

    private static int max(Node root){
        Node temp = root;
        while(temp.right != null){
            temp = temp.right;
        }
        return temp.val;
    }

    private static boolean searching(Node root, int target){
        if(root == null) return false;

        if(root.val == target) return true;

        if(root.val > target) return searching(root.left, target);
        else return searching(root.right, target);
    }

    private static int range(Node root, int min, int max){
        if(root == null) return 0;
        if(root.val < min) return range(root.right, min, max);
        else if(root.val > max) return range(root.left, min, max);
        else 
            return 1 + range(root.left, min, max) + range(root.right, min, max);
    }
}
