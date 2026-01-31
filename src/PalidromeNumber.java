import java.util.Scanner;

public class PalidromeNumber {
    public static void main(String[] args) {

        // Check a number is palindrome

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int number = sc.nextInt();
        int originalNumber = number;
        int numDo = originalNumber;
        int reverse = 0 ;

        // By while loop
        while(number > 0) {
            int numDigit = number % 10;
            number /= 10;
            reverse = reverse * 10 + numDigit;
        }


        // By do-while number;
//        do{
//            int numDigit = number % 10;
//            number /= 10;
//            reverse = reverse * 10 + numDigit;
//        } while(numDo > 0);

        if(originalNumber == reverse) {
            System.out.println("This is a Palindrome Number ");
        }
        else{
            System.out.println("This is not Palindrome Number");
        }





    }
}
