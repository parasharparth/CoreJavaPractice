package practice.december27;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args)
    {
        System.out.println("Enter A number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int reverse = 0;
        while(n!=0)
        {
            int digit = n %10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        System.out.println(reverse);
    }
}
