package src.linked_list;
class Node{
    int val;
    Node next;  // default vallue --> null;

    Node(int val){
        this.val = val;
    }
}
public class display_list {

    public static void displayrecursively(Node head){
        if(head == null) return;
        //  displayrecursively(head.next);   // reverse the linked list
        System.out.print(head.val + " ");
        displayrecursively(head.next);  // print linearly
       
    }

    public static void display(Node head){
        // Node temp = head;
        // while(temp!=null){
        //     System.out.print(temp.val + " ");
        //     temp = temp.next;
        // }

        for(Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
            Node a = new Node(100); // head Node
            Node b = new Node(200); 
            Node c = new Node(300); 
            Node d = new Node(400); 
            Node e = new Node(500);
            Node f = new Node(600);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            // display(a);
            // displayrecursively(a);

            System.out.println(get(a, 3));



            // we can't do this because of null
            // Node n = null;
            // System.out.println(n.val);
            // System.out.println(n.next);
    }

    public static int get(Node head , int index){   // finding any element in the linked list
        Node temp = head;
        for(int i = 0; i<index;i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
