package practice.CY2022.august15.string;

import java.util.Scanner;

public class VowelCheck {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        if(input.matches(".*[aeiouAEIOU].*"))
        {
            System.out.println("Yes, Present");
        }
        else {
            System.out.println("Not Present");
        }
    }
}
