package practice.CY2023.February.feb03;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if(a ==0 || a == 1) System.out.println("Neither even nor odd");
		else if(a%2 ==0) System.out.println("Even");
		else System.out.println("Odd");
	}
}
