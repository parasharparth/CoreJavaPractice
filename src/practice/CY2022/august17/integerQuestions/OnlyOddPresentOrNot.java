package practice.CY2022.august17.integerQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyOddPresentOrNot {

    public static void main(String[] args)
    {
        System.out.println("Enter 4 elements");
        List<Integer> list = new ArrayList<>();
        list.add(new Scanner(System.in).nextInt());
        list.add(new Scanner(System.in).nextInt());
        list.add(new Scanner(System.in).nextInt());
        list.add(new Scanner(System.in).nextInt());
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i) % 2 == 0)
            {
                System.out.println("No, Even numbers are present");
                System.exit(0);
            }
        }
        System.out.println("Yes, Only odd numbers are present");
    }
}
