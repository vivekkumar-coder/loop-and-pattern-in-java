import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {


        // Displays Digits

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        // By while looop
        while (number > 0) {
            int numDigit = number % 10;
            number = number / 10;
            System.out.println(numDigit);
        }


        // By do-while loop
        do {
            int numDigit = number % 10;
            number = number / 10;
            System.out.println(numDigit);
        } while (number > 0);
    }

}
