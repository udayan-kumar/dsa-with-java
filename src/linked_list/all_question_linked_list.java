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

    Node merge(Node head1 , Node head2){
        Node dummy = new Node(-1);
        Node i = head1;
        Node j = head2;
        Node k = dummy;
        while (i!=null && j!=null){
            if(i.val<j.val){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j =j.next;
            }
            k = k.next;
        }
        if(i==null) k.next = j;
        else k.next = i;
        return dummy.next;
    }

    Node mergesort(Node head){
        if(head.next==null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
           
        }
         Node a = slow.next;
            slow.next = null;
        head = mergesort(head); 
        a = mergesort(a);
       return merge(head, a);
        
    }

    Node partion_list(Node head , int x){
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node t1 = d1;  // smaller
        Node t2 = d2;  // larger
        Node t = head;
        while(t != null){
           if(t.val < x){
            t1.next = t;
            t1 = t1.next;
           }
           else{
            t2.next = t;
            t2 = t2.next;
           }
           t = t.next;
        }
        t1.next = d2.next;
        t2.next = null;
        return d1.next;

    }

    Node even_odd(Node head){
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node t1 = d1;  // smaller
        Node t2 = d2;  // larger
        Node t = head;
        while(t != null){
           if(t.val%2==0){
            t1.next = t;
            t1 = t1.next;
           }
           else{
            t2.next = t;
            t2 = t2.next;
           }
           t = t.next;
        }
        t1.next = d2.next;
        t2.next = null;
        return d1.next;
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

public class all_question_linked_list {
    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.addAtTail(10);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.addAtTail(60);
        l1.addAtTail(70);
        // l1.display();

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

        // l1.rotate(3);
        // l1.display();

        linkedlist l2 = new linkedlist();
        l2.addAtTail(20);
        l2.addAtTail(50);
        l2.addAtTail(80);
        l2.addAtTail(90);
        l2.addAtTail(100);
        // l2.display();

    //    l1.merge(l1.head, l2.head);
    //    l1.display();

       linkedlist l3 = new linkedlist();
        l3.addAtTail(3);
        l3.addAtTail(5);
        l3.addAtTail(2);
        l3.addAtTail(4);
        l3.addAtTail(1);
        // l3.display();

        // l3.head = l3.mergesort(l3.head);
        // l3.display();

        linkedlist l4 = new linkedlist();
        l4.addAtTail(2);
        l4.addAtTail(4);
        l4.addAtTail(3);
        l4.addAtTail(0);
        l4.addAtTail(1);
        l4.addAtTail(5);
        l4.display();
       
        l4.partion_list(l4.head, 3);
        l4.display();

        l4.even_odd(l4.head);
        l4.display();


       
      
    }
}
