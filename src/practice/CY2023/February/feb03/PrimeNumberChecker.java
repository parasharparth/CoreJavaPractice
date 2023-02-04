package practice.CY2023.February.feb03;

import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num == 1 || num == 0) {
			System.out.println("Neither prime nor composite");
			return;
		}
		else if(num == 2){
			System.out.println("Prime number");
			return;
		}
		else{
			for(int i=2; i<num/2; i++){
				if(num % i ==0){
					System.out.println("Composite number");
					return;
				}
			}
			System.out.println("Prime number");
		}
	}
}
