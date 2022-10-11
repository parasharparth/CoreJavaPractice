package practice.october10.stringQuestions;

public class VowelsPresentOrNot {

    public static void vowels(String input)
    {
        System.out.println(input.toLowerCase().matches(".*[aeiou].*"));
    }
}
