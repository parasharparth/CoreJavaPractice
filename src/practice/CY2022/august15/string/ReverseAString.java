package practice.CY2022.august15.string;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        sc.close();
        StringBuilder builder = new StringBuilder();
        for(int i = input.length-1; i>=0 ;i--)
        {
            builder.append(input[i]);
        }
        System.out.println(builder.toString());
    }
}
