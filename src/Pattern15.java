public class Pattern15 {
    public static void main(String[] args){
        // Pattern
        /*
                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *
           * * * * * * *
             * * * * *
               * * *
                 *

         */
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(i+j > 5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j = 2; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(j >= i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k = i + 1; k <= 5; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
