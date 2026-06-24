package src.array;

public class unique_value_question {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4,4,4,5,5,6,6,6,7,7};

       
        int j = 1;

        int rep = 0;

       for(int i = 0; i<arr.length; i++){
        if(arr[i] != arr[j]){
            rep = arr[i];
            j++;
        }
       }
       System.out.println(rep);
            

    }
}
