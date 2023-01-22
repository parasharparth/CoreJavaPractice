package practice.CY2022.october26.integerQuestions;

public class OddOrEven {

    public static void oddEvenChecker(int a)
    {
        if(a == 0 || a == 1)
        {
            System.out.println("Neither odd nor even");
            return;
        }
        if(a % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
