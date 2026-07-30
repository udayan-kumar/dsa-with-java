package src.stacks;
class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class my_stack{
    Node head;
    int length;

    int peek(){
        if(head==null){
            System.out.println("stack is empty");
            return -1;
        }
        return head.val;
    }

    int pop(){ // delete at head
        if(head==null){
            System.out.println("stack is empty");
            return -1;
        }
        int x = head.val;
        head = head.next;
        length--;
        return x;
    }

    void push(int ele){  // add at head
        Node temp = new Node(ele);
        if(length==0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        
        length++;
    }

    int size(){
        return length;
    }

    void display(){
        Node temp = head;
        System.out.println();
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }


}
public class ll_implementation_stack {
    public static void main(String[] args) {
        my_stack st1 = new my_stack();

        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
        st1.display();

        System.out.println(st1.peek());

        System.out.println(st1.size());

        st1.pop();
        st1.display();
    }
}
