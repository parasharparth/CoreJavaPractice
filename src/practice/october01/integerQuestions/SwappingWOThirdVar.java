package practice.october01.integerQuestions;

import java.util.Scanner;

public class SwappingWOThirdVar {

    public static void main(String[] args)
    {
        System.out.println("Enter the first number");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter the second number");
        int b = new Scanner(System.in).nextInt();
        b = b+a;
        a = b-a;
        b = b-a;
        System.out.println(a +""+ b);
    }
} //add
