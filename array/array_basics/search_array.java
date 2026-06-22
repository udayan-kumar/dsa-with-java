// if target element axit than print "target axist" and target element doesn't axist than print "target is missing"

package src.array;

import java.util.Scanner;

public class search_array {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        int [] arr = {11,22,3,34,54,34};

        System.out.print("enter target: ");
        int target = ud.nextInt();
        int found = -1; // -1 means target array mein nhii hai

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                found= i; // any number except -1 , means target arrayu mein hai
                
            break;
            }
            }
            
          
        
                if(found != (-1)){
                    System.out.println("target axist in the array" + " " + found);
                }
                else 
                    System.out.println("target is missing in array");
     }
}


