package practice.CY2022.october21.integerQuestions;

public class OddOrEven {

    public static void oddOrEven(int num)
    {
        if(num == 0 || num == 1)
        {
            System.out.println("Neither Odd Nor Even");
            return;
        }
        if(num%2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
