package chap01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		//1,2....n의 합 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("------간다!");
		System.out.println("n을 입력해주세요.");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n;i++) {
			sum += i;
		}
		
		System.out.println("1부터 "+n+"까지의 합은 -> " + sum);
		sc.close();
	}

}
