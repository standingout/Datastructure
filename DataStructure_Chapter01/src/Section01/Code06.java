/*n���� ������ �Է¹޾� ������� �迭�� �����Ѵ�. �׷����� ��� �������� ��ĭ �� ���������� shift�϶�. ������ ������ �迭�� ù ĭ���� �̵��϶�.*/

package Section01;

import java.util.Scanner;

public class Code06 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];

		for(int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		
		kb.close();
		
		System.out.println("���� ��");

		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}


		int tmp = data[n-1];
		for(int i=n-2;i>=0;i--) {
			data[i+1] = data[i];
		}
		data[0] = tmp;

		System.out.println("���� ��");
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);	
		}
	}

}
