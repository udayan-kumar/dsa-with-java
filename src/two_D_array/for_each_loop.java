package src.two_D_array;

public class for_each_loop {
    public static void main(String[] args) {
         int [][] arr = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16}, {17,18,19,20}};
        
         for(int i = 0; i<arr.length; i++){
            for(int ele : arr[i]){
                System.out.print(ele + " ");
            }
            System.out.println();
         }

        //  for(int[] a  : arr){
        //     for(int ele : a){
        //         System.out.print(ele + " ");
        //     }
        //     System.out.println();
        //  }
    }
}
