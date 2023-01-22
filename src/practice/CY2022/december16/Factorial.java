package practice.CY2022.december16;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args)
    {
        System.out.println("Enter the number you want the factorial of");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num == 0)
        {
            System.out.println("0! : "+ 1);
            return;
        }
        int fact=1;
        for(int i=1; i<=num; i++)
        {
            fact = fact * i;
        }
        System.out.println(num+"! --> " + fact);
    }
}
