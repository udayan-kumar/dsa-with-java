package src.linked_list;

import java.util.*;


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

    void delete_value(Node target){   // delete value of the node
        target.val = target.next.val;
        target.next = target.next.next;
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

    Node even_odd_index(Node head){
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node t1 = d1;
        Node t2 = d2;
        Node t = head;
      
        while(t!=null){
          t1.next = t;
          t = t.next;
          t1 = t1.next;
          t2.next = t;
          if(t!=null) t = t.next;
          t2 = t2.next;
        }
       t1.next = d2.next;
       return d1.next;
        
    }

    // Node reverse(Node head){
    //     Node temp = head;
    //     ArrayList<Node> ans = new ArrayList<>();
    //     while(temp!=null){
    //         ans.add(temp);
    //         temp = temp.next;
    //     }
    //     int n = ans.size();
    //     for(int i = n-1 ; i>=1;i--){
    //         ans.get(i).next = ans.get(i-1);
    //     }
    //     ans.get(0).next = null;
    //     return ans.get(n-1);

    // }

    Node reverse(Node head){
        if(head==null || head.next ==null){
            return head;
        }
        Node a = head.next;
        head.next = null;
        Node b = reverse(a);
        a.next = head;
        return b;
    }

    // Node reverse(Node head){
    //     Node forward = head;
    //     Node current = head;
    //     Node pre =null;

    //     while(current!=null){
    //         forward = current.next;
    //         current.next = pre;
    //         pre = current;
    //         current = forward;
    //     }
    //     return pre;
    // }

    // boolean palindrom(Node head){
    //     Node temp = head;
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     while(temp!=null){
    //         arr.add(temp.val);
    //         temp = temp.next;
    //     }
    //     int i = 0 , j = arr.size()-1;
    //     while(i<=j){
    //         int a = arr.get(i) , b = arr.get(j);
    //         if(a!=b) return false;
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }

    boolean palindrom(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);

        Node i = head;
        Node j = head2;
        while(j!=null){
            if(i.val!=j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }

    Node swap_in_pair(Node head){
        if(head==null || head.next==null) return head;
        Node dummy = new Node(-1);
        Node a = head;
        Node b = head.next;
        Node c= dummy;
        while(a!=null && b!=null){
            c.next = b;
            a.next = b.next;
            b.next = a;
            c = a;
            a = a.next;
            if(a!=null) b = a.next;
        }
        return dummy.next;
    }

    Node merge_k(List<Node>  arr){
        while(arr.size()>1){
            Node a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            Node b =  arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            Node c = merge(a, b);
            
        }
        return arr.get(0);
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
       
        // l4.partion_list(l4.head, 3);
        // l4.display();

        // l4.even_odd(l4.head);
        // l4.display();

        // l4.head = l4.reverse(l4.head);
        // l4.display();

    //     linkedlist l5 = new linkedlist();
    //     l5.addAtTail(1);
    //     l5.addAtTail(2);
    //     l5.addAtTail(1);
       
    //    System.out.println(l5.palindrom(l5.head));

       l4.even_odd_index(l4.head);
        // l4.display();

       l4.swap_in_pair(l4.head);
        l4.display();

        
    //    l4.merge_k([{1->2->3->4->5->5->6->7->8}]);
        
    }
}
