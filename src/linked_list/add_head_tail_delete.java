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
    int size;

    void addAtHead(int val){  // adding in head
        Node temp = new Node(val);
        if(head == null) head = tail= temp;  // for empty linked list
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void addAtTail(int val){  // adding in tail
        Node temp = new Node(val);
        if(head==null) head = tail = temp;  // for empty linked list
        else {
             tail.next = temp;
            tail = temp;
        }
         size++;
    }

    void deleteAtHead(){  // deleting in head
        if(head==null){
            System.out.println("linked is empty");
            return;
        }
       
        head = head.next;
         if(head == tail) tail = null;
          size--;
    }

    void display(){
        if(head == null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class add_head_tail_delete {
    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.addAtTail(50);
        l1.display();

        l1.addAtHead(100);
        l1.display();

        l1.deleteAtHead();
        l1.display();

        System.out.println(l1.size);
    }
}
