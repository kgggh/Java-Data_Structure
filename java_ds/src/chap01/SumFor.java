package chap01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		//1,2....n�� �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("------����!");
		System.out.println("n�� �Է����ּ���.");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n;i++) {
			sum += i;
		}
		
		System.out.println("1���� "+n+"������ ���� -> " + sum);
		sc.close();
	}

}
