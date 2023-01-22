package practice.CY2022.october12.integerQuestions;

public class Swapping {

    public static void swap(int a, int b)
    {
        System.out.println("Initial a: "+ a);
        System.out.println("Initial b: "+ b);
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("Final a: "+ a);
        System.out.println("Final b: "+ b);
    }
}
