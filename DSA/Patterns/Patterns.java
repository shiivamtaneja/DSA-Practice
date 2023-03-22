package Patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;


        /* 
                    *****
                    *****
                    *****
                    *****
                    *****
        */
        /* 
        for(int i = 0; i < n;i++){
            for(int j = 0; j< n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* 
                    *
                    **
                    ***
                    ****
                    *****
        */
        /* 
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* 
                    1
                    12
                    123
                    1234
                    12345
        */
        /* 
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */

        /* 
                    1
                    22
                    333
                    4444
                    55555
        */
        /*
        for(int i = 1; i <= n;i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        */

        /* 
                    *****
                    ****
                    ***
                    **
                    *
        */
        /* 
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* 
                    12345
                    1234
                    123
                    12
                    1
        */
        /* 
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */

        /* 
                     *
                    ***
                   ***** 
                  *******
                 *********
        */
        
    }   
}
