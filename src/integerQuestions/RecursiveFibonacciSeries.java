package integerQuestions;

import java.util.Scanner;

public class RecursiveFibonacciSeries {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        for(int i=0 ; i<input;i++)
        {
                System.out.print(fib(i) +" ");
        }
        fib(input);
    }

    public static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}
