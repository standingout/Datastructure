/* ����ڷκ��� n���� ������ �Է¹޾� �հ� �ִ� ���� ���Ͽ� ����ϴ� �ڵ�*/

package Section01;

import java.util.Scanner;

public class Code05 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("���� �Է����ּ���");
		
		int n = kb.nextInt();
		int [] data = new int[n];
		
		
		
		System.out.println(n+"����ŭ ���� �Է����ּ���");
		for(int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		
		kb.close();
		
		int sum = 0, max = data[0];
		
		for(int i=0; i<n; i++) {
			sum += data[i];
			if(data[i]>max)
				max = data[i];
		}
		
		System.out.println("Max is :"+max+" and Sum is "+sum);
			
	}

}
