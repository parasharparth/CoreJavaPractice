package integerQuestions;

public class SwappingWithoutThirdVariable {

    /***************************************************************************
     * @author: Parth Parashar
     * @param args
     * This program swaps two numbers without the use of a third variable
     * calculate a by addition and subtraction in continuity
     * calculate b by subtracting the new values obtained in the steps above
     **************************************************************************/
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        System.out.println("Original Values");
        System.out.println("a :-  "+a);
        System.out.println("b :-  "+b);
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("Swapped Values");
        System.out.println("a :-  "+a);
        System.out.println("b :-  "+b);
    }
}
