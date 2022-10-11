package practice.october10.integerQuestions;

public class RecursiveFibonacciSeries {

    public static void fib(int num)
    {
        for(int i=0; i<=num; i++)
        {
            System.out.print(fibonacci(i)+ " ");
        }
    }

    public static int fibonacci(int num)
    {
        return fibonacci(num-2) + fibonacci(num-1);
    }
}
