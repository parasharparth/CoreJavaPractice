package integerQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyOddCheckUsingStream {

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
        System.out.println(onlyOddPresentOrNot(list));
//        if(result)
//        {
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
    }

    public static boolean onlyOddPresentOrNot(List<Integer> list)
    {
        return list.parallelStream().anyMatch(x->x%2 != 0);
    }
}
