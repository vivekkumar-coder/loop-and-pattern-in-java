import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {

        // Reverse a Number;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number ");
        int number = sc.nextInt();
        System.out.print("Reverse number is ");

        int reverse = 0;

        // By while loop
//        while(number > 0) {
//            int numDigit = number % 10;
//            number /= 10;
//            reverse = reverse * 10 + numDigit;
//        }
        System.out.println(reverse);


        int numDo = number;
        System.out.print("Reverse number is ");

        // By do-while loop
        do{
            int numDigit = numDo % 10;
            numDo /= 10;
            reverse = reverse * 10 + numDigit;
        } while(numDo > 0);
        System.out.println(reverse);
    }
}
