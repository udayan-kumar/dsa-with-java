package src.queues;

class circular_queue{
    int[] arr;
    int front;
    int rear;
    int size;

    circular_queue(int length){
        arr = new int[length];
    }

    void display(){
        if(size==0) return;

        if(front>=rear){
            for(int i = front; i<arr.length; i++){ // front to end
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i<rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else{
            for(int i = front; i<rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    void add(int val){
        if(size==arr.length){
            System.out.println("Queue is full");
            return;
        }
        arr[rear++] = val;
        if(rear==arr.length) rear = 0;
        size++;
    }

    int remove(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int frontval = arr[front];
        front++;
        if(front==arr.length) front = 0;
        size--;

        return frontval;
    }

    int peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
}
public class implementation_via_array {
    public static void main(String[] args) {
        circular_queue q = new circular_queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();

        q.remove();
        q.display();

        q.add(60);
        q.add(70);
        q.add(80);
        q.display();

        int[] a = q.arr;
        for(int ele : a){
            System.out.print(ele + " ");
        }
    }
}
