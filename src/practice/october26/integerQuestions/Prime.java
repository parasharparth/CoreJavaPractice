package practice.october26.integerQuestions;

public class Prime {

    public static void primeChecker(int num)
    {
        if(num == 0 || num == 1)
        {
            System.out.println("Not a prime number");
            return;
        }
        if(num == 2)
        {
            System.out.println("Yes, it is a prime number");
            return;
        }

        int flag = 1;
        for(int i=2; i<num/2; i++)
        {
            if( num % i == 0)
            {
                flag = 0;
            }
        }

        if(flag == 0)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            System.out.println("Yes, a Prime number");
        }
    }
}
