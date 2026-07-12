package src.oops;

import java.util.*;



class arraylist{  // user defined data structure
    int[] arr;
    int index = 0;
    int size = 0;

    arraylist(int capacity){
        arr = new int[capacity];
    }

    void add(int ele){
        if(index==arr.length){  // arr i full
          
            capacityincrease();
           
        }
        arr[index++] = ele;
        size++;
    }

    void capacityincrease(){
          int[] arr2 = new int[arr.length*2];
         for(int i = 0; i<arr.length;i++){  // copy paste
                arr2[i] = arr[i];
            }
            arr= arr2;
    }
    int capacity(){
        return arr.length;
    }

    int get(int index){
        return arr[index];
    }

    void set(int index , int val){
        arr[index] = val;
    }

    void removeend(){
        index--;
        size--;
    }

    void display (){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class own_arraylist {
    public static void main(String[] args) {
      arraylist arr = new arraylist(3);
    //   System.out.println(arr.capacity());

      arr.add(10); arr.add(20); arr.add(30);
        System.out.println(arr.size);

        arr.display();

        System.out.println(arr.get(2));

        arr.add(40); arr.add(40); arr.add(40); arr.add(40);arr.add(40);
        arr.display();
    }
}
