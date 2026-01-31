public class Pattern10 {
    public static void main(String[] args) {
        // Pattern
        /*
         * * * * *
          * * * *
           * * *
            * *
             *
         */

        // By for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        int num1 = 1;
        // By while loop


        while(num1 <= 5){
            int num2 = 1;
            while(num2 <= 5){
                if(num1 <= num2) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
                num2++;
            }
            System.out.println();
            num1++;
        }


        // By do-while loop
        do{
            int num2 = 1;
            do{
                if(num1 <= num2){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
                num2++;
            }while(num2 <= 5);
            num1++;
        }while(num1 <= 5);
    }
}
