import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        // Factorial of a number
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number which want to take factorial ");
        int number = sc.nextInt();

        int factorial = 1;

        if (number == 0) {
            System.out.println("Factorial of 0 = " + 1);
        }

        else if(number > 0){

            // By the for loop
            for (int i = 1; i <= number; i++) {
                System.out.print(i);
                if(i == number) {
                    System.out.println(" ");
                }
                else{
                    System.out.print(" * ");
                }
                factorial *= i;
            }
            System.out.println("= factorial of " + number + " = " + factorial);



            // By while loop
            int iWhile = 1;
            while(iWhile <= number){
                System.out.print(iWhile);
                if(iWhile == number){
                    System.out.println(" ");
                }
                else {
                    System.out.print(" * ");
                }
                factorial *= iWhile;
                iWhile++;
            }
            System.out.println("= factorial of " + number + " = " + factorial); // factorial * factorial



            // By the do-while loop
            int iDoWhile = 1;
            do{
                System.out.print(iDoWhile);
                if(iDoWhile == number) {
                    System.out.println("");
                }
                else {
                    System.out.print(" * ");
                }
                factorial *= iDoWhile;
                iDoWhile++;
            } while(iDoWhile <= number);
            System.out.println("= factorial of " + number + " = " + factorial);  // factorial * factorial * factorial
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
