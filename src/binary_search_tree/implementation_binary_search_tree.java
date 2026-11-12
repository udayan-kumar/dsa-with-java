package src.binary_search_tree;

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
    }

    private static int min(Node root){
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp.val;
    }
}
