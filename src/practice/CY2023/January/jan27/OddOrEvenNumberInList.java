package practice.CY2023.January.jan27;

import java.util.ArrayList;

public class OddOrEvenNumberInList {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(10);
        for(int i=0; i<list.size(); i++)
        {
            list.add(i);
        }
        for(int i:list)
        {
            if(list.get(i) == 0 || list.get(i) == 1)
            {
                System.out.println("Neither odd nor even");
                return;
            }
            else if(list.get(i)%2 == 0)
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
}
