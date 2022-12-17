package practice.december16;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args)
    {
        System.out.println("Enter the number of terms you want to print ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int n1=0;
        int n2=1;
        System.out.print(n1 + " " + n2 +" ");
        for(int i=2; i<n; i++)
        {
            int n3 = n2+n1;
            System.out.print(n3 +" ");
            n1 = n2;
            n2 = n3;
        }
    }
}
