/*1~100000 사이의 소수들을 찾아 출력하는 프로그램*/

package Section01;

public class Code07 {

	public static void main(String[] args) {
		for(int n=2; n<=100000; n++) {
			boolean isPrime = true;
			for(int i=2; i*i<=n && isPrime; i++) {
				if(n%i==0) 							// 자기 자신외에 나머지수 나누었을때 0으로 떨어진다면
					isPrime = false;				// 소수가 아니다.
			}
			if(isPrime)
				System.out.println(n);
		}

	}

}
