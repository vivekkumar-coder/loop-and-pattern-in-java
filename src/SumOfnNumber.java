import java.util.Scanner;

public class SumOfnNumber {
    public static void main(String[] args)
    {
        // find Sum of n Number

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n (Sum of n Number)");
        int number = sc.nextInt();

        int sum = 0;

        // By for loop

        for(int i = 1; i <= number; i++) {
            System.out.print(i);
            if(i==number) {
                System.out.println(" ");
            }
            else {
                System.out.print(" + ");
            }
            sum += i;
        }
        System.out.println("= " + sum);




        // by while loop
        int iWhile = 1;
        while(iWhile <= number){
            System.out.print(iWhile);
            if(iWhile == number) {
                System.out.println(" ");
            }
            else {
                System.out.print(" + ");
            }

            sum += iWhile;
            iWhile++;
        }
        System.out.println("= " + sum);  // 55 + 55 = 110




        // By the do-while
        int iDoWhile = 1;
        do{
            System.out.print(iDoWhile);
            if(iDoWhile == number) {
                System.out.println(" ");
            }
            else {
                System.out.print(" + ");
            }

            sum += iDoWhile;
            iDoWhile++;
        } while(iDoWhile <= number);
        System.out.println("= " + sum);  // 55 + 110 = 165
    }
}
