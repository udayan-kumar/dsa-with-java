import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
       String s1 = "race";
       String s2 = "care";

       char[] arr1 = s1.toCharArray();
       char[] arr2 = s2.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);

       if(arr1.length != arr2.length){
        System.out.println("false");
       }
       for(int i =0; i<arr1.length;i++){
        if(arr1[i] != arr2[i]){
            System.out.println("false");
        }
        else 
            System.out.println("true");
       }

    }
}
