/*1~100000 ������ �Ҽ����� ã�� ����ϴ� ���α׷�*/

package Section01;

public class Code07 {

	public static void main(String[] args) {
		for(int n=2; n<=100000; n++) {
			boolean isPrime = true;
			for(int i=2; i*i<=n && isPrime; i++) {
				if(n%i==0) 							// �ڱ� �ڽſܿ� �������� ���������� 0���� �������ٸ�
					isPrime = false;				// �Ҽ��� �ƴϴ�.
			}
			if(isPrime)
				System.out.println(n);
		}

	}

}
