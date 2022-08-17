package practice.august16.integerQuestions;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args)
    {
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        fibonacci(input);
    }

    public static void fibonacci(int input)
    {
        if(input == 0)
        {
            System.err.println("Number of elements cannot be zero");
            System.exit(1);
        }
        int num1 = 0;
        int num2 = 1;
        int count = 0;
        while(count < input)
        {
            int num3 = num1 +  num2;
            System.out.print(num1+ " ");
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }
    }
}
