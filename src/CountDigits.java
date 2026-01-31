import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Count Digits of a number
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = scan.nextInt();

        int numDigit =0;

        // By do-while loop
        do{
            number /= 10;
            numDigit++;
        }while(number > 0);
        System.out.println(numDigit);


        // By while loop
        while(number > 0) {
            number /= 10;
            numDigit++;
        }
        System.out.println(numDigit);





    }
}
