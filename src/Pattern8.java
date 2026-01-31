public class Pattern8 {
    public static void main(String[] args) {
        // Pattern
        /*
            *
            *  *
            *  *  *
            *  *  *  *
            *  *  *  *  *
         */

        int count = 0;

        // By for loop
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }


        int num1 = 1;

        // By while loop
        while(num1 <= 5){
            int num2 = 1;
            while(num2 <= num1){
                System.out.print("*  ");
                num2++;
            }
            System.out.println();
            num1++;
        }


        // By do-while loop
        do{
            int num2 = 1;
            do{
                System.out.print("*  ");
                num2++;
            }while(num2 <= num1);
        }while(num1 <= 5);
    }
}

