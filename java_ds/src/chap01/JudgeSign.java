package chap01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		//���� ��� �Ǵ��ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ���.");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("����Դϴ�.");
		}else if(n<0) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("0�Դϴ�.");
		}

	}

}
