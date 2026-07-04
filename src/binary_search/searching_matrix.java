package src.binary_search;

public class searching_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,6,12,27,32}, {38,41,47,49,55}, {67,68,75,81}, {84,89,91,92,98}};
        int n = arr.length;
        int m = arr[0].length;
        int target = 555;
        int row = 0;
        int colm =  m-1;

        while(row<n && colm>=0){
            if(arr[row][colm] > target){
                colm--;
            }
            else 
                if(arr[row][colm] < target){
                    row++;
                }
                if(arr[row][colm] == target){
                    System.out.println("true");
                    break;
                }
        }
       
    }
}
