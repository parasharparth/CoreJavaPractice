package practice.december27;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int reverse = 0;
        int orig = n;
        while(n!=0)
        {
            int digit = n%10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        if(reverse == orig)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
