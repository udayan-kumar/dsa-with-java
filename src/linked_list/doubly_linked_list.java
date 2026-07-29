package src.linked_list;
class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    
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

    void display(){
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
        l1.delete_at_head();
        l1.display();
        l1.delete_at_tail();
        l1.display();
    }
}
