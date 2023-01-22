package practice.CY2022.december27;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args)
    {
        while(true) {
            System.out.println("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            if (n == 0 || n == 1) {
                System.out.println("Neither Even nor odd");
                return;
            } else if (n % 2 == 0) {
                System.out.println("Even");
                return;
            } else {
                System.out.println("Odd");
                return;
            }
        }
    }
}
