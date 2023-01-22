package practice.CY2022.august15b.integerQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyOddCheckUsingStream {

    public static void main(String[] args)
    {
        System.out.println("Enter 4 elements of the list");
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        sc.close();
        boolean result = check(list);
        if(result)
        {
            System.out.println("Only odd numbers present");
        }
        else
        {
            System.out.println("Some even numbers also present");
        }
    }

    public static boolean check(List<Integer> list)
    {
        return list.parallelStream().anyMatch(x->x%2 != 0);
    }

}
