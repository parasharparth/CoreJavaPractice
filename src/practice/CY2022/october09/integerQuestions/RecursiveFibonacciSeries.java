package practice.CY2022.october09.integerQuestions;

public class RecursiveFibonacciSeries {

    public static void fib(int num)
    {
        for(int i=0; i<num; i++)
        {
            System.out.println(fibonacci(i)+" ");
        }
    }

    public static int fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n == 1 || n == 2)
        {
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);

    }
}
