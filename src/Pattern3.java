public class Pattern3 {
    public static void main(String[] arg){
        // Pattern
        /*
        2  3  4  5  6
        3  4  5  6  7
        4  5  6  7  8
        5  6  7  8  9
        6  7  8  9  10
         */

        // By for loop
         for(int i = 1; i <= 5; i++){
             for(int j = 1; j <= 5; j++){
                 System.out.print((i + j) + "  ");
//                 System.out.print(i + j + "  ");  // output is same as in line 15
             }
             System.out.println("");
         }


         int num1 = 1;

        // By while loop
        while(num1 <= 5){
            int num2 = 1;
            while(num2 <= 5){
                System.out.print((num1 + num2) + "  ");
                num2++;
            }
            System.out.println("");
            num1++;
        }


        // By do-while loop
        do{
            int num2 = 1;
            do{
                System.out.print((num1 + num2) + "  ");
                num2++;
            }while(num2 <= 5);
            System.out.println("");
            num1++;
        }while(num1 <= 5);
    }
}
