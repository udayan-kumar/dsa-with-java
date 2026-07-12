package src.linked_list;
class Node{
    int val;
    Node next;  // default vallue --> null;

    Node(int val){
        this.val = val;
    }
}

class linkedlist{  // user deffined data structure
    Node head;
    Node tail;

    void addAtTail(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
             tail.next = temp;
            tail = temp;
        }
    }
}

public class data_structure {
    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.addAtTail(10);
    }
}
1:49