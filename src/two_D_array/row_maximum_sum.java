package src.two_D_array;

public class row_maximum_sum {
    public static void main(String[] args) {
         int [][] arr = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16}};

         int max =0;
        int row = -1;

         for(int i =0; i<4; i++){
             int sum =0;
            for(int j =0; j<4; j++){
               sum += arr[i][j];
                if(sum > max){
                    max = sum;
                    row = i;
                }
            }
            

         }
         System.out.println( row + " " +max);
    }
}
