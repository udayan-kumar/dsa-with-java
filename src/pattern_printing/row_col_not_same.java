package src.pattern_printing;

import java.util.Scanner;

public class row_col_not_same {
    public static void main(String[] args){
          Scanner ud = new Scanner(System.in);
          int n = ud.nextInt();
        int num = 1;
         for(int i = 0 ; i<n; i++){
            //  System.out.println((char)(num+64));
            //   num++;
         if(i%2==0){
            System.out.println((char)(num +96));
            }else{
                System.out.println((char)(num + 64));
            }
            num++;
         }

        //   for(int i = 1; i<=n;i++){
            
        //         for(int j = 1; j<=n; j++){
        //             for(int )
        //         }
        //     }
                //  System.out.println();
          }
         

    }

