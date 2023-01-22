package practice.CY2022.october12.integerQuestions;

public class OddOrEvenCheck {

    public static void oddEven(int num)
    {
        if(num == 0 || num == 1)
        {
            System.out.println("Neither even Nor Odd");
            return;
        }
        if(num %2 == 0)
        {
            System.out.println("Even");
            return;
        }
        else
        {
            System.out.println("Odd");
            return;
        }
    }
}
