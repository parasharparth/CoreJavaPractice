package stringQuestions;

public class ReverseAString {

    /***********************************************************************
     * @author: Parth Parashar
     * @param args
     * This program reverse the string inputted by the user
     * The first step is to convert the string to a character array
     * The second step is to iterate in the reverse order and put it in the
     *********************************************************************/
    public static void main(String[] args)
    {
        String input = "reverse";
        char[] inputArray = input.toCharArray();
        StringBuilder outputBuilder = new StringBuilder();
        for(int i=inputArray.length-1; i>=0;i--)
        {
            outputBuilder.append(inputArray[i]);
        }
        String output = outputBuilder.toString();
        System.out.println(output);
    }
}
