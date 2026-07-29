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

    ListNode delete_at_head(ListNode head){
        if(head==null){
            System.out.println("linked list is empty");
        }
        if(size==1) head = tail = null;
        head = head.next;
        head.prev = null;
        size--;
        return head;
    }

    ListNode delete_at_tail(ListNode head){
        if(tail==null){
            System.out.println("linked list is empty");
        }
        if(size==1) head = tail = null;
        tail = tail.prev;
        tail.next = null;
        size--;
        return head;
    }

    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class doubly_linked_list {
    public static void main(String[] args) {
        dll l1 = new dll();
    }
}
