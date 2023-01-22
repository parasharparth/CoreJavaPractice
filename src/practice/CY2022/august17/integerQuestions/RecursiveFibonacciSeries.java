package practice.CY2022.august17.integerQuestions;

import java.util.Scanner;

public class RecursiveFibonacciSeries {

    public static void main(String[] args)
    {
        System.out.println("Enter the Number of elements");
        int n = new Scanner(System.in).nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n)
    {
        if(n == 1 || n == 0)
        {
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
