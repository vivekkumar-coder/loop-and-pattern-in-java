import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] arg) {
        // Display Geometric progression

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the First term of GP ");
        int firstTerm = scan.nextInt();
        System.out.println("Enter the common difference of GP ");
        int commonDifference = scan.nextInt();
        System.out.println("Enter the number of term of GP ");
        int numOfTerm = scan.nextInt();

        int term = 0;

        // By while loop
        while(term < numOfTerm) {
            System.out.print(firstTerm + ", ");
            firstTerm *= commonDifference;
            term++;
        }


        // By do-while loop
        do {
            System.out.print(firstTerm + ", ");
            firstTerm *= commonDifference;
            term++;
        } while(term < numOfTerm);


        // By for loop
        for(term = 0; term < numOfTerm; term++) {
            System.out.print(firstTerm + ", ");
            firstTerm *= commonDifference;
        }
    }
}
