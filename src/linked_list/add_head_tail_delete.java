package src.linked_list;

import src.methods.return_type;

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

    int search(int val){  // searching index
        if(head==null) return -1;
        Node temp = head;
        int index = 0;
        while(tail!=null){
            if(temp.val==val) return index;
            temp = temp.next;
            index++;
        }
        return -1;
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

    void insert(int val, int index) {  // insert at any index
       if(index<0 || index>size){
        System.out.println("invalid index");
        return;
       }
       if(index==0) addAtHead(val);
       else
        if(index==size) addAtTail(val);
       else{
        Node temp = head;
        for(int i = 0; i<index;i++){
            temp = temp.next;
        }
        Node newtemp = new Node(val);
        newtemp.next = temp.next;
        temp.next = newtemp;
        size++;
       }
    }

    int get(int index) {
        Node temp = head;
        for(int i = 0;i<index;i++){
            temp = temp.next;
        }
        return temp.val;
    }

    Node rotate(int k ){
        if(k==0) return head;
        if(head == null || head.next == null) return head;
        int length= 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        k %= length;
        Node slow = head;
        Node fast = head;
       
       for(int i = 0; i<k+1;i++){
        fast = fast.next;
       }
       while(fast != null){
        slow = slow.next;
        fast = fast.next;
       }
       Node a = slow.next;
       slow.next = null;
       Node t = a;
       while(t.next != null){
        t = t.next;
       }
       t.next = head;
       return a;
           
    }

     void delete(int index) {
        if(index<0 || index>=size){
            System.out.println("invalid index");
            return;
        }
        if(index==0) deleteAtHead();
        Node temp = head;
        for(int i = 0; i<=index-1;i++){
            temp= temp.next;
        }
        temp.next = temp.next.next;
        if(index == size-1) tail=temp; // delete last index
        size--;
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

    //     l1.addAtHead(100);
    //     l1.display();

    //     l1.deleteAtHead();
    //     l1.display();

    //     l1.insert(200,3);
    //     l1.display();

    //     l1.delete(4);
    //     l1.display();

    //   System.out.println(l1.get(3));

        // System.out.println(l1.size);

        l1.rotate(3);
        l1.display();
    }
}
