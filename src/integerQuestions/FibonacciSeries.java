package integerQuestions;


import java.util.Scanner;

public class FibonacciSeries {

    /******************************************************************
     * @author: Parth Parashar
     * @param args
     * This program is used to print the fibonacci series
     * This program uses a normal loop to print the fibonacci series
     ******************************************************************/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        while(counter < n)
        {
            System.out.println(num1);
            int num3 = num1 +  num2;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
