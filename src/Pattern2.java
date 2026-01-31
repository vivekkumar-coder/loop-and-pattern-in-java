public class Pattern2 {
    public static void main(String[] args) {
//    Draw a pattern
     /*
      1  1  1  1  1
      2  2  2  2  2
      3  3  3  3  3
      4  4  4  4  4
      5  5  5  5  5
      */

        // By for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + "  ");
            }
            System.out.println("");
        }


        int num1 = 1;

        // By while loop
        while (num1 <= 5) {
            int num2 = 1;
            while (num2 <= 5) {
                System.out.print(num1 + "  ");
                num2++;
            }
            System.out.println("");
            num1++;
        }


        // By do-while loop
        do {
            int num2 = 1;
            do {
                System.out.print(num1 + "  ");
                num2++;
            } while (num2 <= 5);
            System.out.println("");
            num1++;
        } while (num1 <= 5);
    }
}
