public class WhileDoWhilePractice {
    public static void main(String[] args)
    {
        int i = 1;
        while(i < 100)
        {
            System.out.println(i);
//            i = i * 2;
            i *=2;
        }

        do
        {
            System.out.println(i);
            i *= 2;
        } while(i < 100);



        int z = 5;
        if(true) {
            System.out.println(z);
        }


        byte m = 1;
        while(true) {
            System.out.println(m);
            m++;
        }




    }
}
