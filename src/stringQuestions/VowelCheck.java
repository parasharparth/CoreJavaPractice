package stringQuestions;

import java.util.Scanner;

public class VowelCheck {

    /*********************************************************************************
     * @author: Parth Parashar
     * @param args
     * This program is used to check whether a vowel is present in a string or not
     * The first step is to get the input from the user
     * The second step is to check whether vowel is present or not
     * Both lowercase and Uppercase have to be checked
     *********************************************************************************/
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        vowel(input);
    }

    public static void vowel(String input) {
        if (input.matches(".*[aeiou].*"))
        {
            System.out.println("LowerCase vowel Present");
        }
        else if(input.matches(".*[AEIOU].*"))
        {
            System.out.println("UpperCase vowel present");
        }
        else {
            System.out.println("Vowel not present");
        }
    }
}
