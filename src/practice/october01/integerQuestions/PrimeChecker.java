package practice.october01.integerQuestions;

import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args)
    {
        int flag = 0;
        System.out.println("Enter the number you want to check");
        int a = new Scanner(System.in).nextInt();
        if(a == 0 || a == 1)
        {
            System.out.println("Not a prime number");
        }
        if( a== 2)
        {
            System.out.println("Yes a prime number");
        }
        for(int i=1; i<a/2; i++)
        {
            if(a%i == 0)
            {
                flag = 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("Yes a prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}
