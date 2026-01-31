import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Display Multipication Table

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number which you want ot print table : ");
        int number = scan.nextInt();



        // By for loop
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }



        // By while loop
        int i = 1;
        while(i <= 10) {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }



        // By do- while loop
        int j = 1;
        do {
            System.out.println(number + " * " + j + " = " + (number * j));
            j++;
        } while(j <= 10);
    }
}
