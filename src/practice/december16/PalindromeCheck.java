package practice.december16;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args)
    {
        //Steps required for palindrome check
        //1) Reverse the number
        //2) check with the given number and if equal, yes palindrome, else not
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int orig = num;
        int reverse = 0;
        while(num!=0)
        {
            int digit = num % 10;
            reverse = reverse *10 + digit;
            num = num / 10;
        }
        if(orig == reverse)
        {
            System.out.println("Yes, a palindrome");
        }
        else {
            System.out.println("No, Not a palindrome");
        }
    }
}
