package src.queues;


class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class MyQueue{
    Node head;
    Node tail;
    int size;

    void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void add(int val){
        Node temp = new Node(val);
        if(size==0) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
            size++;
    }

    int remove(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.val;
        head = head.next;
        size--;
        return front;
    }

    int peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.val;
    }
}
public class implementation_via_linkedlist {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();

        q.remove();
        q.display();

        System.out.println(q.peek());
    }
}
