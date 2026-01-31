public class Pattern9 {
    public static void main(String[] args) {
        // Pattern
    /*
        1  2  3  4  5
        1  2  3  4
        1  2  3
        1  2
        1
     */

        // By for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }


        int num1 = 1;

        // By while loop
        while(num1 <= 5){
            int num2 = 1;
            while(num2 <= 5 - num1 + 1){
                System.out.print(num2 + "  ");
                num2++;
            }
            System.out.println();
            num1++;
        }

        // By do-while loop
        do{
            int num2 = 1;
            do{
                System.out.print(num2 + "  ");
                num2++;
            }while(num2 <= 5);
            System.out.println();
            num1++;
        }while(num1 <= 5);
    }
}
