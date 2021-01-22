package chap01;

import java.util.Scanner;

public class Max_min {
	public static void main(String[]args) {
		
		//입력받아서 최대값 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요-> ");int a = sc.nextInt();
		System.out.print("숫자를 입력해주세요-> ");int b = sc.nextInt();
		System.out.print("숫자를 입력해주세요-> ");int c = sc.nextInt();
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.println("최대값은 -> " + max + "입니다.");
		
		
		System.out.println("----------");
		System.out.println("====메소드 호출=====");
		max3(4,9,1);
		max4(13,10,11,2);
		min3(8,7,10);
		min4(4,1,7,10);
		sc.close();
	}
	
	
	// 3개중 최대값 구하기
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.println("최대값은 -> " + max + "입니다." );
		return max;
	}
	// 4개중 최대값 구하기
	static int max4(int a, int b, int c,int d) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		System.out.println("최대값은 -> " + max + "입니다." );
		return max;
	}
	
	// 3개중 최소값 구하기
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		System.out.println("최소값은 -> " + min + "입니다." );
		return min;
	}
	
	// 4개중 최소값 구하기
	static int min4(int a, int b, int c,int d) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(d < min) {
			min = d;
		}
		System.out.println("최소값은 -> " + min + "입니다." );
		return min;
	}

}
