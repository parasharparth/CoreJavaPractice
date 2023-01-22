package practice.CY2022.october10.integerQuestions;

public class OddOrEven {

    public static boolean oddOrEven(int num)
    {
        //here false means odd and true means even

        if(num == 0 || num == 1)
        {
            return false;
        }

        if(num%2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
