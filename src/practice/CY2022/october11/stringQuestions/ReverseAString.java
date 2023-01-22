package practice.CY2022.october11.stringQuestions;

public class ReverseAString {

    public static void reverse(String str)
    {
        System.out.println("REVERSING A STRING");
        char ch;
        String reversedString = "";
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            reversedString = ch + reversedString;
        }
        System.out.println("Reverse String is: "+reversedString);
    }
}
