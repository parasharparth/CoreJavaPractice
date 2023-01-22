package practice.CY2022.october21.integerQuestions;

public class PrimeChecker {

    public static void primeChecker(int num) {
        if (num == 0 || num == 1) {
            System.out.println("Neither Prime Nor Even");
            return;
        }

        if (num == 2) {
            System.out.println("Yes, Prime");
        }
        int flag = 1;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = 0;
                return;
            }
        }
        if (flag == 0)
        {
            System.out.println("Not a prime");
        }
        else
        {
            System.out.println("Yes a prime number");
        }
    }
}
