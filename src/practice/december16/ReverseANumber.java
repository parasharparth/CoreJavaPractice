package practice.december16;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args)
    {
        System.out.println("Enter the number you want to reverse");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversed = 0;
        sc.close();

        while(num!=0){
            int digit = num%10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }
        System.out.println("Reversed Number: "+reversed);
    }
}
