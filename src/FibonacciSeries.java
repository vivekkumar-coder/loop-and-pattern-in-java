import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] arg) {
        // Display Fibonnacci Series

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of term till where you want to print fibonnacci Series");
        int numOfTerm = sc.nextInt();

        int firstTerm = 0, secondTerm = 1, thirdTerm, number = 0;
        System.out.print(firstTerm + " " + secondTerm + " ");

        // By while loop
        while(number < numOfTerm - 2) {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            System.out.print(thirdTerm + " ");
            number++;
        }


        // By do-while loop
        do {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            System.out.print(thirdTerm + " ");
            number++;
        } while(number < numOfTerm - 2);


        // By for loop
        for( number = 0; number < numOfTerm - 2; number++){
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            System.out.print(thirdTerm + " ");
        }
    }
}
