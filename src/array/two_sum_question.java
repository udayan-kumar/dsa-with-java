// check target element is the sum of any two element of an array or not;

package src.array;

public class two_sum_question {
    public static void main(String[] args) {
        
        int[] arr = {1,23,43,56,78};

        int target = 134;

        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("two sum axis");
                    break;
                }
                
            }
            
                
         }
    }
}
