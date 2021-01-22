package chap01;

import java.util.Scanner;

public class SumForEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지 합 구하기\n값을입력해주세요.");
		int n = sc.nextInt();
		int sum = 0;
		for(int i= 1;i<=n;i++) {
			if(i == n) {
				System.out.print(n);
			}else {
				System.out.print(i+"+");
			}
			sum += i;
		}
		System.out.println("=" + sum);
		sc.close();
		
	}
	
	
}
