package practice.october10.integerQuestions;

public class FibonacciSeries {

    public static void fibonacci(int num)
    {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        if(num == 0 || num == 1)
        {
            System.out.println("1");
        }
        while(counter <= num)
        {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
