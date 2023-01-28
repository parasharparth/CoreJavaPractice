package practice.CY2023.January.jan24;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

    public static void main(String[] args)
    {
        System.out.print("First Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Second Number: ");
        int b = sc.nextInt();
        sc.close();
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("First Number: "+ a);
        System.out.println("Second Number: "+ b);
    }
}
