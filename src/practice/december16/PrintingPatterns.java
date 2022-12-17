package practice.december16;

public class PrintingPatterns {

    public static void main(String[] args)
    {
        System.out.println("Right star triangle pattern");
        pattern1();
        System.out.println("Reverse right star triangle pattern");
        pattern2();
    }

    public static void pattern1()
    {
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2()
    {
        for(int i=0; i<=5; i++)
        {
            for(int j=i+1; j<=5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
