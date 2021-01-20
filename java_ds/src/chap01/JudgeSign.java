package chap01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		//음수 양수 판단하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("양수입니다.");
		}else if(n<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}

	}

}
