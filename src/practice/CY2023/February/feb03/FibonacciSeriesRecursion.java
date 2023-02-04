package practice.CY2023.February.feb03;

import java.util.Scanner;

public class FibonacciSeriesRecursion {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for(int i=0; i<num; i++) System.out.println(fib(i)+" ");
	}
	public static int fib(int num){
		if(num == 0) return 0;
		if(num == 1 || num == 2) return 1;
		return fib(num-2) + fib(num - 1);
	}
}
