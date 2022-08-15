package practice.august15.integer;

import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean result = prime(input);
        if(result == true)
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }

    public static boolean prime(int input)
    {
        if(input==2)
        {
            return true;
        }
        if(input == 0 || input == 1)
        {
            return true;
        }
        for(int i=2;i<=input/2;i++)
        {
            if(input%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
