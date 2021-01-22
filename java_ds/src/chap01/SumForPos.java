package chap01;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		//1.....n까지 양수만 입력받기
		do {
			System.out.println("a를 입력해주세요");
			n = sc.nextInt();
		} while (n<0);
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(n+"까지의 합은? " + sum);
		sc.close();
	}
}
