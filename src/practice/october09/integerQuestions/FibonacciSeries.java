package practice.october09.integerQuestions;

public class FibonacciSeries {

    public static void fibonacci(int num)
    {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        while(counter < num)
        {
            System.out.println(num1);
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
