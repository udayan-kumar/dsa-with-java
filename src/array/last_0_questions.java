package src.array;

public class last_0_questions {
    public static void main(String[] args) {
        int[] arr = {9,8,0,1,0,4,2,5,7,2,9,5,4,6,6,2,0,1,9,0};
        int n = arr.length;
        
        int j =0; 
        
        for(int i = 0; i<n; i++){
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i =0; i< n; i++){
            System.out.println(arr[i] + " ");
        }
       

            
    }
 }

