package zadaci;

import java.util.Scanner;

public class Main {
	public static void jeLiProst() {
		Scanner mojSkener = new Scanner(System.in);
		
		int n = mojSkener.nextInt();

		if(n == 1) {
			System.out.println("Nije ni prost ni slozen");
		} else {
			
			boolean jeLiProst = true;
			
			for(int i = 2; i <= n / 2; i++) {
				if(n % i == 0) {
					jeLiProst = false;
					break;
				}
			}
			
			if(jeLiProst) {
				System.out.println("Prost je");
			} else {
				System.out.println("Nije prost");
			}
			
		}
		
		mojSkener.close();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		int M = sc.nextInt();
		
		sc.close();
		
		int drveca = N;
		int dan = 1;
		
		while(drveca > 0) {
			if(dan % K != 0) {
				drveca = drveca - A;
			}
			
			if(dan % M != 0) {
				drveca = drveca - B;
			}
			
			dan = dan + 1;
		}
		
		System.out.println(dan - 1);
	}
}
















