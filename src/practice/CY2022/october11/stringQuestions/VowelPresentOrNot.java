package practice.CY2022.october11.stringQuestions;

public class VowelPresentOrNot {

    public static void vowelCheck(String str)
    {
        System.out.println("VOWEL CHECK");
        int flag = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.toLowerCase().matches(".*[aeiou]*."))
            {
                flag = 1;
            }
        }
        if(flag == 1)
        {
            System.out.println("Vowel Present");
        }
        else
        {
            System.out.println("Vowel Not Present");
        }
    }
}
