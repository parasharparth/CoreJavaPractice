package practice.october11.driver;

import practice.october11.stringQuestions.RemovingWhitespaces;
import practice.october11.stringQuestions.ReverseAString;
import practice.october11.stringQuestions.VowelPresentOrNot;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)
    {
        System.out.println("Enter a String");
        String input = new Scanner(System.in).next();
        ReverseAString.reverse(input);
        VowelPresentOrNot.vowelCheck(input);
        RemovingWhitespaces.removeWhiteSpace("Parth Parashar");
    }
}
