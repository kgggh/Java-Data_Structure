package chap01;

import java.util.Scanner;

public class Madian {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a값을 입력해주세요 => ");int a = sc.nextInt();
		System.out.println("b값을 입력해주세요 => ");int b = sc.nextInt();
		System.out.println("c값을 입력해주세요 => ");int c = sc.nextInt();
		
		System.out.println("중간값은 " + med3(a,b,c) + "입니다.");
	}
	
	
	//중간값 구하기
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b > c) {
				return b;
			}
			else if (a <= c) {
				return a;
			} else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if (b > c) {
			return c;
		}else {
			return c;
		}
	}
}
