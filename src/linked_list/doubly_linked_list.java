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
}
public class doubly_linked_list {
    public static void main(String[] args) {
        dll l1 = new dll();
    }
}
