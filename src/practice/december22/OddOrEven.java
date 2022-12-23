package practice.december22;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args)
    {
        System.out.println("Enter the number you want to check");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0 || n == 1)
        {
            System.out.println("Neither odd nor Even");
            return;
        }
        if(n%2 == 0)
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("ODD");
        }
        return;
    }
}
