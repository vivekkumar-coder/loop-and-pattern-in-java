public class IntToString {
    public static void main(String[] args) {

        int number = 123;


        // Method - 1
        /*
            String.valeOf(int)
         */
        String str1 = String.valueOf(number);
        System.out.println(str1);


        // Method - 2
        /*
           DataType.toString(number);
         */
        String str2 = Integer.toString(number);
        System.out.println(str2);


        // Method - 3
        /*
           empty string method
         */
        String str3 = String.valueOf(number);
        System.out.println(str3);

    }
}
