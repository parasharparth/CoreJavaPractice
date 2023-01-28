package practice.CY2023.January.jan27;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args)
    {
        System.out.println("Enter the number you want to check");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num == 0 || num == 1)
        {
            System.out.println("Neither odd Nor Even");
            return;
        }
        else if(num%2 == 0)
        {
            System.out.println("Even");
            return;
        }
        else
        {
            System.out.println("Odd");
            return;
        }
    }
}
