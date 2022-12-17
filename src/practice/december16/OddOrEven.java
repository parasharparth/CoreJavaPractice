package practice.december16;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1)
        {
            System.out.println("Neither even nor odd");
            return;
        }
        if(n%2 == 0)
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
