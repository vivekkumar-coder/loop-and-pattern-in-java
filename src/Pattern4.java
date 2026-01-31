public class Pattern4 {
    public static void main(String[] args) {
        // Pattern
        /*
        01  02  03  04  05
        06  07  08  09  10
        11  12  13  14  15
        16  17  18  19  20
        21  22  23  24  25
         */

//      Method - 1

        int count = 0;

        // By for loop
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.format("%02d  ", ++count );
            }
            System.out.println("");
        }




        int numWhile = 1;

        // By while loop
        while(numWhile <= 5){
            int num2 = 1;
            while(num2 <= 5){
                System.out.format("%02d  ", ++count);
                num2++;
            }
            System.out.println("");
            numWhile++;
        }



        // By do-while loop
        do{
            int num2 = 1;
            do{
                System.out.format("%02d  " , ++count);
                num2++;
            }while(num2 <= 5);
            System.out.println("");
            numWhile++;
        }while(numWhile <= 5);




//        Method - 2

        // By for loop
        for(int i = 1; i <= 5; i++){
            for(int j = 4; j >= 0; j--){
                System.out.format("%02d  ", (i * 5) - j);
            }
            System.out.println("");
        }


        int num1 = 1;

        // By while loop
        while(num1 <= 5){
            int num2 = 4;
            while(num2 >= 0){
                System.out.format("%02d  ", (num1 * 5) - num2);
                num2--;
            }
            System.out.println("");
            num1++;
        }


        do{
            int num2 = 4;
            do{
                System.out.format("%02d  ", (num1 * 5) - num2);
                num2--;
            }while(num2 >= 0);
            System.out.println("");
            num1++;
        } while(num1 <= 5);
    }
}
