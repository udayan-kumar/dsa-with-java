package src.stacks;

import java.util.Stack;

class Node{
    int val;
    Node next;

    Node (int val){
        this.val = val;
    }
}


public class remove_node_linked_list {
    public static void main(String[] args) {
        
    }

    public Node remove(Node head){
        Stack <Node> st = new Stack<>();
        Node temp = head;
        while(temp!=null){
            if(st.size()==0) st.push(temp);
            else
                if(st.peek().val>=temp.val) st.push(temp);
            else
                if(st.peek().val<temp.val){
                    while(st.size()!=0 && st.peek().val>temp.val){
                        st.pop();
                        st.push(temp);
                    }
                }
                temp = temp.next;
        }
        
        while(st.size()!=0){
            Node conn = st.pop();
            conn.next = temp;
            temp = conn;
        }
        return temp;
    }
}
