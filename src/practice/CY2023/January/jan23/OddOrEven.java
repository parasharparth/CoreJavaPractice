package practice.CY2023.January.jan23;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args)
    {
        System.out.println("Enter the Number you want to check");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0 || num == 1)
        {
            System.out.println("Neither even nor odd");
            return;
        }
        if(num % 2 == 0)
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
