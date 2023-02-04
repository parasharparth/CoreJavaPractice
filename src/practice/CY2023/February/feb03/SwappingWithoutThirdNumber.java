package practice.CY2023.February.feb03;

import java.util.Scanner;

public class SwappingWithoutThirdNumber {
	public static void main(String[] args){
		System.out.println("Enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		b = b + a;
		a = b - a;
		b = b - a;
		System.out.println("a "+ a);
		System.out.println("b "+b);
	}
}
