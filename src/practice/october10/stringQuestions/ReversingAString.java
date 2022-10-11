package practice.october10.stringQuestions;

public class ReversingAString {

    public static void reverseAString(String input)
    {
        char ch;
        for(int i=0; i<input.length(); i++)
        {
            ch = input.charAt(i);
            input = ch + input;
        }

        System.out.println("reversed string:- "+input);
    }
}
