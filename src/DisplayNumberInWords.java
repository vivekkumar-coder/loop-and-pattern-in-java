import java.util.Scanner;

public class DisplayNumberInWords {
    public static void main(String[] args) {

        // Display a number in words with tailing 0

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = scan.nextInt();
        int numDigit;
        String str = "";
        char charNum;

        while (number > 0) {
            numDigit = number % 10;
            number /= 10;
            str += numDigit;
        }




        int j = str.length() - 1;


        // By the while loop
        while(j >= 0)
        {
            charNum = str.charAt(j);

            switch (charNum) {
                case '0':
                    System.out.print("Zero");
                    break;
                case '1':
                    System.out.print("One");
                    break;
                case '2':
                    System.out.print("Two");
                    break;
                case '3':
                    System.out.print("Three");
                    break;
                case '4':
                    System.out.print("Four");
                    break;
                case '5':
                    System.out.print("Five");
                    break;
                case '6':
                    System.out.print("Six");
                    break;
                case '7':
                    System.out.print("Seven");
                    break;
                case '8':
                    System.out.print("Eight");
                    break;
                case '9':
                    System.out.print("Nine");
                    break;
            }
            System.out.print(" ");
            j--;
        }

        System.out.println("");


//        // By do-while loop
//        do {
//            charNum = str.charAt(j);
//
//            switch (charNum) {
//                case '0':
//                    System.out.print("Zero");
//                    break;
//                case '1':
//                    System.out.print("One");
//                    break;
//                case '2':
//                    System.out.print("Two");
//                    break;
//                case '3':
//                    System.out.print("Three");
//                    break;
//                case '4':
//                    System.out.print("Four");
//                    break;
//                case '5':
//                    System.out.print("Five");
//                    break;
//                case '6':
//                    System.out.print("Six");
//                    break;
//                case '7':
//                    System.out.print("Seven");
//                    break;
//                case '8':
//                    System.out.print("Eight");
//                    break;
//                case '9':
//                    System.out.print("Nine");
//                    break;
//            }
//            System.out.print(" ");
//            j--;
//        } while(j >= 0);




//         By for loop
        for (int i = str.length() - 1; i >= 0; i--)
        {
            charNum = str.charAt(i);

            switch (charNum) {
                case '0':
                    System.out.print("Zero");
                    break;
                case '1':
                    System.out.print("One");
                    break;
                case '2':
                    System.out.print("Two");
                    break;
                case '3':
                    System.out.print("Three");
                    break;
                case '4':
                    System.out.print("Four");
                    break;
                case '5':
                    System.out.print("Five");
                    break;
                case '6':
                    System.out.print("Six");
                    break;
                case '7':
                    System.out.print("Seven");
                    break;
                case '8':
                    System.out.print("Eight");
                    break;
                case '9':
                    System.out.print("Nine");
                    break;
            }
            System.out.print(" ");
        }


    }
}
