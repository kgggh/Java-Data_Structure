package chap01;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다");
	
		do {
			System.out.println("몇 단 삼각형 만들어보실?");
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
	
	//실습 메소드 구현이다!!!
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
