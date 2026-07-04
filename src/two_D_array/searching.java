package src.two_D_array;

public class searching {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16}};
        
        int target = 13;
        int m = arr.length;
        int n = arr[0].length;
        int i = 0;
        int j = n-1 ;

        // for(int i = 0; i<arr.length; i++){
        //     for(int j = 0; j<arr[0].length; j++){
        //         if(arr[i][j] == target){
        //             System.out.println("true");
        //            break;
        //         }
        //     }
        // }
           

        while(i<m && j>=0){
            if(arr[i][j] > target){
                j--;
            }
            else 
                 if(arr[i][j] < target){
                    i++;
                 }
                 else 
                    if(arr[i][j] == target){
                        System.out.println("true");
                        break;
                    }
        }
    }
}
