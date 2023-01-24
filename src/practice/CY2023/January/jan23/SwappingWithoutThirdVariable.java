package practice.CY2023.January.jan23;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

    public static void main(String[] args)
    {
        System.out.println("First Number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Second Number: ");
        int num2 = sc.nextInt();
        sc.close();
        num2 = num2 + num1;
        num1 = num2 - num1;
        num2 = num2 - num1;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}
