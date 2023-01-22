package practice.CY2022.october21.driver;

import practice.CY2022.october21.integerQuestions.FibonacciSeries;
import practice.CY2022.october21.integerQuestions.OddOrEven;
import practice.CY2022.october21.integerQuestions.PrimeChecker;
import practice.CY2022.october21.integerQuestions.SwappingWithoutThird;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)
    {
        SwappingWithoutThird.swap(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt());
        FibonacciSeries.fib(new Scanner(System.in).nextInt());
        OddOrEven.oddOrEven(new Scanner(System.in).nextInt());
        PrimeChecker.primeChecker(new Scanner(System.in).nextInt());
    }
}
