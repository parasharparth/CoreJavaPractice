package practice.CY2022.october01.integerQuestions;

import java.util.Scanner;

public class OddEvenCheck {

    public static void main(String[] args)
    {
        System.out.println("Enter the number you want to check");
        int a = new Scanner(System.in).nextInt();
        if(a == 0 || a== 1)
        {
            System.out.println("Neither odd nor even");
        }
        if(a%2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    } //add
}
