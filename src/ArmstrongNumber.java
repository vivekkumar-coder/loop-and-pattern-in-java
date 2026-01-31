import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Finding a number is Armstrong or not

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int numberInt = scan.nextInt();

        int number = numberInt;
        int temp = numberInt;
        int numCubeSum = 0;
        int count = 0;

        // By while loop
        while(temp > 0) {
           temp /= 10;
           count++;
        }

        while (number > 0) {
            int numDigit = number % 10;
            number = number / 10;
            numCubeSum += (int) Math.pow(numDigit, count);
        }


        // do-while loop
        do{
            temp /= 10;
            count++;
        } while(temp > 0);

        do {
            int numDigit = number % 10;
            number /= 10;
            numCubeSum += (int)Math.pow(numDigit, count);
        } while(number > 0);




        System.out.println(numCubeSum);
        if (numCubeSum == numberInt) {
            System.out.println("This is a Armstrong Number");
        } else {
            System.out.println("This is not Armstrong Number");
        }
    }
}
