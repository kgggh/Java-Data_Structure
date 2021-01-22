package chap01;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�");
	
		do {
			System.out.println("�� �� �ﰢ�� ������?");
			n = sc.nextInt();
			
		} while (n<=0);

		for(int i = 1; i <= n;i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		triangleLB(4);
		triangleRU(5);
		triangleRB(5);
	}
	
	//�ǽ� �޼ҵ� �����̴�!!!
	static void triangleLB(int n ) {
		for(int i = 1; i <= n;i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRU(int n ) {
		for(int i = 1; i <= n;i++) {
			for(int j = 1; j<=n - i + 1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) { 				
			for (int j = 1; j <= n - i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println(); 					
		}
	}

}
