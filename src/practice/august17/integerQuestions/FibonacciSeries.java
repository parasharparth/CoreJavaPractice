package practice.august17.integerQuestions;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args)
    {
        System.out.println("Enter the number of elements");
        fibonacci(new Scanner(System.in).nextInt());
    }

    public static void fibonacci(int n)
    {
        int num1 = 0;
        int num2 = 1;
        int count = 0;
        while(count < n)
        {
            System.out.print(num1 +" ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }
    }
}
