package practice.october10.integerQuestions;

public class PrimeChecker {

    public static void prime(int num)
    {
        if(num == 1 || num == 0)
        {
            System.out.println("Neither odd nor even");
            return;
        }

        if(num == 2)
        {
            System.out.println("Prime Number");
            return;
        }

        int flag = 0;

        for(int i=2; i<num/2; i++)
        {
            if(num % i == 0)
            {
                flag = 1;
            }
        }

        if(flag == 1)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            System.out.println("Prime Number");
        }
    }
}
