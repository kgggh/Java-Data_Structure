package chap01;

import java.util.Scanner;

public class Max_min {
	public static void main(String[]args) {
		
		//�Է¹޾Ƽ� �ִ밪 ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���-> ");int a = sc.nextInt();
		System.out.print("���ڸ� �Է����ּ���-> ");int b = sc.nextInt();
		System.out.print("���ڸ� �Է����ּ���-> ");int c = sc.nextInt();
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.println("�ִ밪�� -> " + max + "�Դϴ�.");
		
		
		System.out.println("----------");
		System.out.println("====�޼ҵ� ȣ��=====");
		max3(4,9,1);
		max4(13,10,11,2);
		min3(8,7,10);
		min4(4,1,7,10);
		sc.close();
	}
	
	
	// 3���� �ִ밪 ���ϱ�
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.println("�ִ밪�� -> " + max + "�Դϴ�." );
		return max;
	}
	// 4���� �ִ밪 ���ϱ�
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
		System.out.println("�ִ밪�� -> " + max + "�Դϴ�." );
		return max;
	}
	
	// 3���� �ּҰ� ���ϱ�
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		System.out.println("�ּҰ��� -> " + min + "�Դϴ�." );
		return min;
	}
	
	// 4���� �ּҰ� ���ϱ�
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
		System.out.println("�ּҰ��� -> " + min + "�Դϴ�." );
		return min;
	}

}
