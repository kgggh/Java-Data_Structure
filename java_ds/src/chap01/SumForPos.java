package chap01;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		//1.....n���� ����� �Է¹ޱ�
		do {
			System.out.println("a�� �Է����ּ���");
			n = sc.nextInt();
		} while (n<0);
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(n+"������ ����? " + sum);
		sc.close();
	}
}
