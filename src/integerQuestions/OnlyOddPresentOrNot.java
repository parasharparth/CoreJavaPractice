package integerQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyOddPresentOrNot {

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter 4 numbers: -");
        Scanner sc = new Scanner(System.in);
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        sc.close();
       boolean result = onlyOddPresentOrNot(list);
       if(result == true)
       {
           System.out.println("Yes");
       }
       else {
           System.out.println("No");
       }
    }

    public static boolean onlyOddPresentOrNot(List<Integer> list)
    {
        if(list == null || list.size() == 0)
        {
           System.out.println("List is null / empty");
           return false;
        }
        else
        {
            for(int i:list)
            {
                if(i % 2 == 0)
                {
                    return false;
                }
            }
        return true;
        }
    }
}
