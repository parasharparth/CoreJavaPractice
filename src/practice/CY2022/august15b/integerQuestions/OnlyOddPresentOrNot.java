package practice.CY2022.august15b.integerQuestions;

import java.util.*;

public class OnlyOddPresentOrNot {

    public static void main(String[] args)
    {
        System.out.println("Enter 4 elements");
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        sc.close();
        if(onlyOddPresent(list))
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static boolean onlyOddPresent(List<Integer> list)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i) % 2 == 0)
            {
                return false;
            }
        }
        return true;
    }
}
