package practice.CY2022.october21.integerQuestions;

public class FibonacciSeries {

    public static void fib(int num)
    {
        int num1 = 0;
        int num2 = 1;
        int count = 0;
        while(count < num)
        {
            System.out.println(num1);
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }
    }
}
