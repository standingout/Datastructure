/* n���� ������ �Է¹޾� �迭�� �����Ѵ�. �̵� �߿��� 0�� �̻��� ���ӵ� �������� ���� ���� �� �ִ� �ִ밪�� ���Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.*/

package Section01;

import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for(int i=0;i<n;i++) {
			data[i] = kb.nextInt();
		}
		
		
		int maxSum=0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				 int sum = 0;
				 for(int k=i; k<=j; k++) {
					 sum += data[k];
				 }
				 if(sum>maxSum)
					 maxSum = sum;
			
			}
		}
		
		System.out.println("The max sum is" + maxSum);
		
		kb.close();
		
	}

}
