package practice.CY2022.august17.integerQuestions;

import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args)
    {
        if(prime(new Scanner(System.in).nextInt()))
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static boolean prime(int n)
    {
        if(n == 0 || n == 1)
        {
            return false;
        }
        if(n == 2)
        {
            return true;
        }
        for(int i=2 ; i<=n/2; i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
