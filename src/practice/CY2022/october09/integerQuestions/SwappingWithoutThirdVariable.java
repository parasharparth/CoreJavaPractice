package practice.CY2022.october09.integerQuestions;

public class SwappingWithoutThirdVariable {

    public static void swap(int a, int b)
    {
        b = b + a;
        a = b - a;
        b = b - a;

        System.out.println("a:- "+a);
        System.out.println("b:- "+b);
    }
}
