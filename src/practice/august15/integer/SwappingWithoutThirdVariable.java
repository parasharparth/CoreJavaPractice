package practice.august15.integer;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        sc.close();
        b = b+a;
        a = b-a;
        b = b-a;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
