package chap02;
// ���� ����� �ڷ����� int���� �迭 (���� ��ڼ���  5 : new�� ����  ��ü�� ������

class IntArray {
	public static void main(String[] args) {
		int[] a = new int[5];	// �迭�� ����

		a[1] = 37;				// a[1]�� 37�� ����
		a[2] = 51;				// a[2]�� 51�� ����
		a[4] = a[1] * 2;		// a[4]�� a[1] * 2 �� 74�� ����

		for (int i = 0; i < a.length; i++)	// �� ����� ���� ��Ÿ��
			System.out.println("a[" + i + "] = " + a[i]);
	}
}