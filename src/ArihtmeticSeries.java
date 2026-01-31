import java.util.Scanner;

public class ArihtmeticSeries {
    public static void main(String[] arg)
    {
        // Display Arithmatic progression Series

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of term of AP ");
        int numberOfTerm = scan.nextInt();
        System.out.println("Enter the number of first term of AP ");
        int firstTerm = scan.nextInt();
        System.out.println("Enter the number of common difference of AP ");
        int commonDifference = scan.nextInt();

        int numWhile = 0;


        // By the while loop
        while(numWhile < numberOfTerm) {
            System.out.print(firstTerm + ", ");
            firstTerm += commonDifference;
            numWhile++;
        }


        // By do-while loop
        do{
            System.out.print(firstTerm + ", ");
            firstTerm += commonDifference;
            numWhile++;
        } while(numWhile < numberOfTerm);



        // By for loop
        for(numWhile = 0; numWhile < numberOfTerm; numWhile++){
            System.out.print(firstTerm + ", ");
            firstTerm += commonDifference;
        }

    }
}
