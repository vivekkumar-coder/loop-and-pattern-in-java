public class Pattern7 {
    public static void main(String[] args) {
        // Pattern
        /*
         1
         2   3
         4   5   6
         7   8   9  10
        11  12  13  14  15
         */

        int count = 0;

        // By for loop
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.format("%2d ", ++count);
            }
            System.out.println();
        }


        int num1 = 1;

        // By while loop
        while(num1 <= 5){
            int num2 = 1;
            while(num2 <= num1){
                System.out.format("%2d  ", ++count);
                num2++;
            }
            System.out.println();
            num1++;
        }


        // By do-while loop
        do{
            int num2 = 1;
            do{
                System.out.format("%2d  ", ++count);
                num2++;
            }while(num2 <= num1);
        }while(num1 <= 5);
    }
}
