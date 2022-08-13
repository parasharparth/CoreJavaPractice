package integerQuestions;

import java.util.Scanner;

public class PrimeChecker {

    /********************************************************************************************************************************
     * @author: Parth Parashar
     * @param args
     * The first step is to get the input from the user
     * The second step is to check whether it is 0 or 1
     * The third step is to check for 2 as it is already a prime number
     * The fourth step is to iterate till n/2 to find whether there is a number which completely divides the given number or not
     * The fifth step is to print the result
     *******************************************************************************************************************************/
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        boolean result = primeCheck(input);
        if(result == true)
        {
            System.out.println("Yes Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }

    public static boolean primeCheck(int input)
    {
        if(input == 1 || input == 0)
        {
            return false;
        }
        if(input == 2)
        {
            return true;
        }

        for(int i=2; i<input/2;i++)
        {
            if(input % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
