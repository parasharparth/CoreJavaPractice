package practice.august15b.integerQuestions;
import java.util.Scanner;
public class PrimeChecker {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        if(primeChecker(input))
        {
            System.out.println("Yes, Prime");
        }
        else {
            System.out.println("No, Not Prime");
        }
    }

    public static boolean primeChecker(int n)
    {
        if(n==0 || n==0)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        for(int i=2; i<=n/2; i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
