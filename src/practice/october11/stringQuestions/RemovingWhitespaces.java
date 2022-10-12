package practice.october11.stringQuestions;

public class RemovingWhitespaces {

    public static void removeWhiteSpace(String str)
    {
        System.out.println("Removing whitespaces");
        StringBuilder output = new StringBuilder();
           for(int i=0; i<str.length(); i++)
           {
               if(!Character.isWhitespace(str.charAt(i)))
               {
                    output.append(str.charAt(i));
               }
           }
           System.out.println(output);
    }
}
