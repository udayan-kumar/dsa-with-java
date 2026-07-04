package src.two_D_array;

import java.util.ArrayList;

public class Arraylists {
    public static void main(String[] args) {
       ArrayList<Integer> a = new ArrayList<>();
       a.add(3);  a.add(2);  a.add(1);  a.add(0);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);  b.add(2);  b.add(3);  b.add(9);

         ArrayList<Integer> c = new ArrayList<>();
         c.add(7);  c.add(6);  

         ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
         arr.add(a); arr.add(b); arr.add(c);

        //  System.out.println(arr);

        // for(int i = 0; i<arr.size();i++){
        //     for(int j =0; j<arr.get(i).size(); j++){
        //         System.out.print(arr.get(i).get(j) + " ");
        //     }
        //     System.out.println();
        // }

        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10);
        arr.get(arr.size()-1).add(20);

        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
