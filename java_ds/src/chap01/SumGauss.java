package chap01;

import java.util.Scanner;

public class SumGauss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� n���� �� ���ϱ�\n�����Է����ּ���.");
		int n = sc.nextInt();
		int i = 1;
		int sum = (i+n)*(n/2);
		
		System.out.println("1���� " +n+"������ ���� => " +sum);
		System.out.println("---------�Է� ���� a ~ b ������ �� ���ϱ�--------");
		System.out.println("a�� �Է����ּ���");int a = sc.nextInt();
		System.out.println("b�� �Է����ּ���");int b = sc.nextInt();
		System.out.println(a+"��"+b+"�� ����=> "+ sumof(a,b));
		sc.close();
	}
	static int sumof(int a, int b) {
		int min;
		int max;
		if(a<b) {
			min = a;
			max = b;
		}else {
			min = b;
			max = a;
		}
		int sum=0;
		for(int i=min;i<=max;i++) {
			sum+=i;
		}
		return sum;
	}
}
