package chap01;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2�ڸ� ��� 10~99���� �Է� �ޱ�
		int no;
		
		do {
			System.out.println("2�ڸ� ������ �Է����ּ���.");
			no = sc.nextInt();
		} while (no<10||no>99);
		
		System.out.println("���� >>>" + no);
		

	}

}
