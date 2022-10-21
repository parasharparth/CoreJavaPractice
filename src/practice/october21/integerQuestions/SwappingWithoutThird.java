package practice.october21.integerQuestions;

public class SwappingWithoutThird {

    public static void swap(int a, int b)
    {
        b = b+a;
        a = b-a;
        b = b-a;
        System.out.println(a);
        System.out.println(b);
    }
}
