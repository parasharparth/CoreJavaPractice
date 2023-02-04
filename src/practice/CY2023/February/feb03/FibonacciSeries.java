package practice.CY2023.February.feb03;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args){
		System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT TO PRINT");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int num1 =0;
		int num2 = 1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2; i<=num; i++){
			num3 = num1 +  num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
