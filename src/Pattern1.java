public class Pattern1 {
    public static void main(String[] arg) {
        // Pattern
        /*
        1  2  3  4  5
        1  2  3  4  5
        1  2  3  4  5
        1  2  3  4  5
        1  2  3  4  5
         */


        // By for loop
       for(int i = 1; i <= 5; i++) {
           for(int j = 1; j <= 5; j++){
               System.out.print(j + "  ");
           }
           System.out.println("");
       }

        // by while loop
        int num1 = 1;

        while (num1 <= 5) {
            int num2 = 1;
            while (num2 <= 5) {
                System.out.print(num2 + "  ");
                num2++;
            }
            System.out.println("");
            num1++;
        }


        // do-while loop
        do{
            int num2 = 1;
            do{
               System.out.print(num2 + "  ");
               num2++;
            }while(num2 <= 5);
            System.out.println("");
            num1++;
        }while(num1 <= 5);

    }
}
