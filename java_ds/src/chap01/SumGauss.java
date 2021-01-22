package chap01;

import java.util.Scanner;

public class SumGauss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지 합 구하기\n값을입력해주세요.");
		int n = sc.nextInt();
		int i = 1;
		int sum = (i+n)*(n/2);
		
		System.out.println("1부터 " +n+"까지의 합은 => " +sum);
		System.out.println("---------입력 받은 a ~ b 까지의 합 구하기--------");
		System.out.println("a를 입력해주세요");int a = sc.nextInt();
		System.out.println("b를 입력해주세요");int b = sc.nextInt();
		System.out.println(a+"와"+b+"의 합은=> "+ sumof(a,b));
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
