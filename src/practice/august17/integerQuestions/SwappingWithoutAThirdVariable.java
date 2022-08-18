package practice.august17.integerQuestions;

import java.util.Scanner;

public class SwappingWithoutAThirdVariable {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        sc.close();
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("Changed numbers is: "+ a + "  "+ b);
    }
}
