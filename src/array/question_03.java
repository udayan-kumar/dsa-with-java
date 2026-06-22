// find how many 9 in the array;;


package src.array;

public class question_03 {
    public static void main(String[] args) {
        int[] arr = {9,8,0,1,0,4,2,5,7,2,9,5,4,6,6,2,0,1,9,0};

        int nine = 0;

        for(int ele : arr){
            if (ele == 9){
                nine++;
            }
        }
        System.out.println(nine);
    }
}
