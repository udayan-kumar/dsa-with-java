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

    // Node rotate(int k ){
    //     if(k==0) return head;
    //     if(head == null || head.next == null) return head;
    //     int length= 0;
    //     Node temp = head;
    //     while(temp != null){
    //         temp = temp.next;
    //         length++;
    //     }
    //     k %= length;
    //     Node slow = head;
    //     Node fast = head;
       
    //    for(int i = 0; i<k+1;i++){
    //     fast = fast.next;
    //    }
    //    while(fast != null){
    //     slow = slow.next;
    //     fast = fast.next;
    //    }
    //    Node a = slow.next;
    //    slow.next = null;
    //    Node t = a;
    //    while(t.next != null){
    //     t = t.next;
    //    }
    //    t.next = head;
    //    return a;
           
    // }

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

    Node partion_around_linked_list(Node head , int x){
        Node t = head;
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node d3 = new Node(-1);
        Node t1 = d1;
        Node t2 = d2;
        Node t3 = d3;

        while(t!=null){
            if(t.val<x){
                t1.next = t;
                t1 = t1.next;
            }
            else if(t.val==x){
                t2.next = t;
                t2 = t2.next;
            }
            else{
                if(t.val>x){
                    t3.next = t;
                    t3 = t3.next;
                }
            }
            t = t.next;
        }
        t1.next = d2.next;
        t2.next = d3.next;
        t3.next = null;
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

    int middle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    Node delete_middle(Node head){
        if(head==null && head.next==null) return head;
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // int find_kth_end(Node head , int k){
    //     Node temp = head;
    //     int length = 0;
    //     while(temp!=null){
    //         temp = temp.next;
    //         length ++;
    //     }
    //     temp = head;
    //     int n = length -k;
    //     for(int i = 1;i<=n ; i++){
    //         temp = temp.next;
    //     }
    //     return temp.val;
    // }

    int find_kth_end(Node head , int k){
        Node slow = head;
        Node fast = head;

       for(int i = 1; i<=k ; i++){
        if(fast==null) return -1;
        fast = fast.next;
       }
       while(fast!=null ){
        slow = slow.next;
        fast = fast.next;
       }
       return slow.val;
    }

    Node delete_kth_end(Node head , int k){
        Node slow = head;
        Node fast = head;

        for(int i = 1 ; i<=k ; i++){
            if(fast == null) return head;
            fast = fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    Node intersection(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int length1 = 0;
        int length2 = 0;
        
        while(temp1!=null){
            temp1 = temp1.next;
            length1 ++;
        }
        while(temp2!=null){
            temp2 = temp2.next;
            length2 ++;
        }
        temp1 = head1;
        temp2 = head2;
        if(length1>length2){
             for(int i = 1; i<=length1-length2;i++){
                temp1 = temp1.next;
            }
        }
        else
         if(length1<length2){
             for(int i = 1; i<=length2-length1;i++){
                temp2 = temp2.next;
            }
        }
       
        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

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

    // Node reverse_between_index(int a , int b , Node head){
    //     ArrayList <Node> arr = new ArrayList<>();
    //     Node temp = head;
    //     while(temp!=null){
    //         arr.add(temp);
    //         temp = temp.next;
    //     }
    //     int i = a-1, j = b-1;
    //     while(i<j){
    //         Node t1 = arr.get(i);
    //         Node t2 = arr.get(j);
    //         arr.set(i, t2);
    //         arr.set(j, t1);
    //         i++;
    //         j--;
    //     }

    //     for(int k = 0 ; k<arr.size();k++){
    //         arr.get(k).next = (k==arr.size()-1) ? null : arr.get(k+1);
    //     }
    //     return arr.get(0);
    // }

    Node reverse_between_index(int a , int b , Node head){
        Node dummy = new Node(-1);
        dummy.next = head;
        Node temp = dummy;

        for(int i = 0; i<a-1;i++){
            temp = temp.next;
        }
        Node tail1 = temp;
        Node head2 = temp.next;
        temp = dummy;

        for(int i =0 ; i<b ;i++){
            temp = temp.next;
        }
        Node tail2 = temp;
        Node head3 = temp.next;
        tail1.next = null;
        tail2.next = null;

        Node current = head2;
        Node forward = head2;
        Node pre = null;

        while(current!=null){
            forward = current.next;
            current.next = pre;
            pre = current;
            current = forward;
        }
        tail1.next = tail2;
        head2.next = head3;
        return dummy.next;
    }

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

    Node swap(Node head , int k){
        Node slow = head;
        Node fast = head;

        for(int i = 1; i<=k ; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        fast = head;
        for(int i = 1 ;i<=k-1;i++){
            fast = fast.next;
        }
        int temp = fast.val;
        fast.val = slow.val;
        slow.val = temp;

        return head;
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

    boolean detect_loop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
           
        }
         return false;
    }

    int find_first_node_loop(Node head){
        Node slow = head;
        Node fast = head;
        Node a = head;

        while(slow == fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        while(a==slow){
            a = a.next;
            slow = slow.next;
        }
        return a.val;
    }

    Node remove_dublicate(Node head){
        Node i = head;
        Node j = head;
        while(j!=null){
            if(i.val==j.val){
                j = j.next;
            }
            else{
                i.next = j;
                i = j;
               j = j.next;
            }
        }
        // i.next = j;
        return head;
    }

    Node remove_dublicate_2(Node head){
        Node dummy = new Node(-1);
        Node i = head;
        Node t = dummy;

        while(i!=null){
            if(i.next==null || i.val != i.next.val){
                t.next = i;
                t = i;
                i = i.next;
            }
            else {
                Node j = i.next;
                while(j!=null && j.val==i.val){
                    j = j.next;
                }
                i = j;
            }
        }
        t.next = i;
        return dummy.next;
    }

    Node rotate(Node head , int k){
        if(head==null || head.next == null) return head;
        int length = 0;
        Node count = head;
        while(count!=null){
            count = count.next;
            length ++;
        }
        k %=length;
        if(k==0) return head;
       Node slow = head;
       Node fast = head;
       for(int i = 1; i<=k ;i++){
        fast = fast.next;
       }
       while(fast!=null){
        slow = slow.next;
        fast = fast.next;
       }
       Node a = slow.next;
       slow.next = null;
       Node temp = a;
       while(temp.next!=null){
        temp = temp.next;
       }
       temp.next = head;
       return a;
    }

    Node reorder_list(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node a = head;
        Node b = slow.next;
        slow.next = null;
        Node forward = b;
        Node current = b;
        Node pre = null;

        while(current!=null){
            forward = current.next;
            current.next = pre;
            pre = current;
            current = forward;
        }
        b = pre;

        Node dummy = a;
        while(a!=null && b!=null){
           Node nextA = a.next;
           Node nextB = b.next;

           a.next = b;
           b.next = nextA;

           a = nextA;
           b = nextB;
        }
        return dummy;

    }

    Node add_number_linked_list(Node head1 , Node head2){
        Node current = head1;
        Node forward = head1;
        Node pre = null;
        int carry = 0;
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(current!=null){
            forward = current.next;
            current.next = pre;
            pre = current;
            current = forward;
        }

        Node current1 = head2;
        Node forward1 = head2;
        Node pre1 = null;

        while(current1!=null){
            forward1 = current1.next;
            current1.next = pre1;
            pre1 = current1;
            current1 = forward1;
        }

        Node temp1 = pre;
        Node temp2 = pre1;

        while(temp1!=null || temp2!=null || carry!=0){
            // int x = (temp1!=null) ? temp1.val : 0;
            // int y = (temp2!=null) ? temp2.val : 0;
            int sum = carry + temp1.val + temp2.val;
            Node adding = new Node(sum);
            if(sum>9) sum = sum%10;
            carry = sum/10;
            temp.next = adding;
            temp = adding;
            if(temp1!=null)
                temp1 = temp1.next;
            if(temp2!=null)
                temp2 = temp2.next;
        }
        // if(carry!=0){
        //     temp.next = new Node(carry);
        // }

        dummy = dummy.next;
        Node current2 = dummy;
        Node forward2 = null;
        Node pre2 = null;

        while(current2!=null){
            forward2 = current2.next;
            current2.next = pre2;
            pre2 = current2;
            current2 = forward2;
        }
        return pre2;

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
        // l4.display();

        l4.head = l4.rotate(l4.head, 3);
        // l4.display();

        // System.out.println(l4.middle(l4.head));

        // l4.delete_middle(l4.head);
        // l4.display();

        // System.out.println(l4.find_kth_end(l4.head, 2));

        // l4.delete_kth_end(l4.head , 2);
        // l4.display();

        // l4.swap(l4.head, 2);
        // l4.display();
       
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
        // l4.display();

        
    //    l4.merge_k([{1->2->3->4->5->5->6->7->8}]);

        linkedlist l6 = new linkedlist();
        l6.addAtTail(2);
        l6.addAtTail(2);
        l6.addAtTail(4);
        l6.addAtTail(5);
        // l6.display();

        // l6.remove_dublicate(l6.head);
        // l6.display();

        // l6.head = l6.remove_dublicate_2(l6.head);
        // l6.display();

        linkedlist l7 = new linkedlist();
        l7.addAtTail(1);
        l7.addAtTail(4);
        l7.addAtTail(3);
        l7.addAtTail(2);
        l7.addAtTail(5);
        l7.addAtTail(2);
        l7.addAtTail(3);
        // l7.display();

        // l7.partion_around_linked_list(l7.head, 3);
        // l7.display();

        linkedlist l8 = new linkedlist();
        l8.addAtTail(1);
        l8.addAtTail(2);
        l8.addAtTail(3);
        l8.addAtTail(4);
        l8.addAtTail(5);
        l8.addAtTail(6);
        l8.addAtTail(7);
        l8.display();

        // l8.reorder_list(l8.head);
        // l8.display();

        // l8.reverse_between_index(2, 5, l8.head);
        // l8.display(); 

        l8.add_number_linked_list(l8.head , l8.head);
        l8.display();


        
    }
}
