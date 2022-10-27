package practice.october26.integerQuestions;

public class Swapping {

    public static void swap(int a, int b)
    {
        System.out.println("Initial values are : - "+ a +" , "+ b);
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("Final Values are : - "+ a + " , "+ b);
    }
}
