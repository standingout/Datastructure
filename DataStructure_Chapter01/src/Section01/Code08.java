/*����ڷκ���  n���� ������ �Է¹޴´�. �̾ N���� ������ �Է¹޾� ������� �迭�� �����Ѵ�. 
  �׷� ���� �ߺ��� ���� ���� ������ ī��Ʈ�Ͽ� ����϶�. ���� ��� n=6�̰� �Էµ� �������� 2,4,2,4,5,2 
  �ߺ��� �������� (2,2),(2,2),(2,2),(4,4)�� ��� 4���̴�.*/

package Section01;

import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);    //Scanner �ν��Ͻ�ȭ
		int n = kb.nextInt(); // ����ڷκ��� n�� ������ �Է¹���
		int [] data= new int[n];  // n����ŭ�� �迭�� ���� �� �ִ� �迭�� �Է¹޴´�.
		
		for(int i=0;i<n;i++) // ����ڷκ��� n���� ������ �Է¹޴´�.
			data[i] = kb.nextInt();
		
		int count = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(data[i]==data[j])
					count++;
			}
		}
		
		System.out.println("�ߺ��� �������� �� "+count+"���Դϴ�.");
		

	}

}
