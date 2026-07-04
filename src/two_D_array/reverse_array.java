package src.two_D_array;

public class reverse_array {
    public static void main(String[] args) {
     int [][] arr = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16}, {17,18,19,20}};
        
     for(int i =arr.length -1;i>=0;i--){
        for(int j = 0; j<arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
     }
    }
}
