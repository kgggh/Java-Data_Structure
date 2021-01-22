package chap01;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2자리 양수 10~99까지 입력 받기
		int no;
		
		do {
			System.out.println("2자리 정수를 입력해주세요.");
			no = sc.nextInt();
		} while (no<10||no>99);
		
		System.out.println("값은 >>>" + no);
		

	}

}
