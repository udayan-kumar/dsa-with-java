package src.two_D_array;

import java.util.Scanner;

public class output_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];
        // int [][] arr = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16}};

        System.out.println(arr.length );  // it gives length of row of the 2D-array
        System.out.println( arr[1].length);  // it gives length of column of any row of the 2D-array

        for(int i =0; i<3; i++){
            for(int j =0; j<4;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i =0; i<3; i++){
            for(int j =0; j<4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
