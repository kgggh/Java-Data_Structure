package chap01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		//1,2....n�� �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("------����!");
		System.out.println("n�� �Է����ּ���.");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i<=n) {
			sum +=i;
			i++;
		}
		System.out.println("1���� "+n+"������ ���� -> " + sum);
	}

}
