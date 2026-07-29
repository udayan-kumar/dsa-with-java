package src.linked_list;

import src.basics_baatein.first;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode child;
    
    ListNode(int val){
        this.val = val;
    }
}
class dll{
    ListNode head;
    ListNode tail;
    int size;

    void add_at_head(int val){
        ListNode temp = new ListNode(val);

        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void add_at_tail(int val){
        ListNode temp = new ListNode(val);

        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void add_at_index(int value , int index){
        if(index<0 || index>size){
            System.out.println("invalid index");
            return;
        }
        if(index==0){
            add_at_head(value);
            return;
        }
        if(index==size){
            add_at_tail(value);
            return;
        }
        ListNode temp = head;
        ListNode t1 = new ListNode(value);
        for(int i = 0; i<index-1 ; i++){
            temp = temp.next;
        }
        t1.next = temp.next;
        temp.next.prev = t1;
        temp.next = t1;
        t1.prev = temp;
        size++;
    }

    void delete_at_head(){
        if(size==0){
            System.out.println("linked list is empty");
        }
        if(size==1) head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void delete_at_tail(){
        if(tail==null){
            System.out.println("linked list is empty");
        }
        if(size==1) head = tail = null;
        tail = tail.prev;
        tail.next = null;
        size--;
       
    }

    void delete_at_index(int index){
        if(index<0 || index>size){
            System.out.println("invalid index");
            return;
        }
        if(index==0){
            delete_at_head();
            return;
        }
        if(index==size){
            delete_at_tail();
            return;
        }
        ListNode temp = head;
        for(int i = 0; i<index-1; i++){
            temp = temp.next;
        }
        ListNode deletenode = temp.next;
        temp.next = deletenode.next;
        deletenode.next.prev = temp;
        size--;
    }

    void display(){
        if(head==null) return;
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void diplay_reverse(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
        
    }

    ListNode reverse_linked_list(ListNode head){
        // ListNode current = head;
        // ListNode forward = null;
        // ListNode pre = null;

        // while(current!=null){
        //     forward = current.next;
        //     current.next = pre;
        //     current.prev = forward;
        //     pre = current;
        //     current = forward;
        // }
        // return pre;

        ListNode temp = null;
        ListNode current = head;
        while(current!=null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        return temp.prev;
    }

    ListNode rotate(ListNode head , int k){
        ListNode slow = head;
        ListNode fast = head;

        for(int i =0; i<k; i++){
            fast = fast.next;
        }

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        // ListNode temp = a;
        fast.next = head;

        // while(temp.next!=null){
        //     temp = temp.next;
        // }
        // temp.next = head;
        // head.prev = temp;

        return a;
    }

    ListNode delete_dublicate(ListNode heaNode){
        ListNode i = head;
        ListNode j = head;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;

        while(j.next!=null){
            t.next = i;
            t = i;
            j = j.next;
            if(i.val != j.val){
                i = j;
                i.prev = t;
            }
        }
        return dummy.next;
    }

    ListNode flatten(ListNode head){
        if(head == null) return head;
        ListNode current = head;
        while(current!=null){
            if(current.child==null) current = current.next;
            else{
                ListNode forward = current.next;
                ListNode c = flatten(current.child);
                current.child = null;
                current.next = c;
                c.prev = current;
                ListNode temp = c;
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next = forward;
                if(forward!=null)
                    forward.prev = temp;
                current = forward;
            }
        }
        return head;

    }

    int[] num_node_min_max(ListNode head){
        int[] ans = {-1,-1};
        ListNode a = head;
        ListNode b = a.next;
        ListNode c = b.next;
        int index = 1;
        int firstindex = -1;
        int lastindex = -1;
        int mindistance = -1;

        if(c==null) return ans;

        while(c!=null){
            if((b.val>a.val && b.val>c.val) || (b.val<a.val && b.val<c.val)){
                if(firstindex == -1) firstindex = index;
                if(lastindex!=-1){
                    int distance = index - lastindex;
                    mindistance = Math.min(distance, mindistance);
                }
                lastindex = index;
            }
            index++;
            a = a.next;
            b = b.next;
            c = c.next;
        }
        int maxdistance = lastindex - firstindex;
        if(maxdistance==0) maxdistance = -1;
        if(mindistance==-1) mindistance = -1;
        ans[0] = mindistance;
        ans[1] = maxdistance;
        return ans;
    }

    
}
public class doubly_linked_list {
    public static void main(String[] args) {
        dll l1 = new dll();
        // l1.add_at_head(10);
        // l1.add_at_head(20);
        // l1.add_at_head(30);
        // l1.add_at_head(40);
        // l1.add_at_head(50);

        l1.add_at_tail(10);
        l1.add_at_tail(20);
        l1.add_at_tail(30);
        l1.add_at_tail(40);
        l1.add_at_tail(50);
        l1.display();
        // l1.diplay_reverse();

        // l1.delete_at_head();
        // l1.display();

        // l1.delete_at_tail();
        // l1.display();

        // l1.delete_at_index(3);
        // l1.display();

        // l1.add_at_index(100,3);
        // l1.display();
        // l1.diplay_reverse();

        // l1.head = l1.reverse_linked_list(l1.head);
        // l1.display();
        // l1.diplay_reverse();

        // l1.rotate(l1.head, 3);
        // l1.display();

        dll l2 = new dll();
        l2.add_at_tail(1);
        l2.add_at_tail(1);
        l2.add_at_tail(2);
        l2.add_at_tail(2);
        l2.add_at_tail(3);
        l2.add_at_tail(4);
        // l2.display();

        // l2.delete_dublicate(l2.head);
        // l2.display();
        // l2.diplay_reverse();

        dll l3 = new dll();
        l3.add_at_tail(5);
        l3.add_at_tail(3);
        l3.add_at_tail(1);
        l3.add_at_tail(2);
        l3.add_at_tail(5);
        l3.add_at_tail(1);
        l3.add_at_tail(2);
        l3.display();

        
        System.out.println(l3.num_node_min_max(l3.head));
        
        
        
        
    }
}
