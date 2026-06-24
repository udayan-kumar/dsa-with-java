package src.sorting;

public class check_sorting {
    public static void main(String[] args) {
        int[ ] arr = {5,1,2,3,4,5,6};
        
        

        for(int i = 1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
            System.out.println("false");
           
        }
        else
            System.out.println("true");
            break;
        }

        
    }
}
