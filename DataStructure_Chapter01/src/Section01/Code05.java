/* 사용자로부터 n개의 정수를 입력받아 합과 최대 값을 구하여 출력하는 코드*/

package Section01;

import java.util.Scanner;

public class Code05 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("정수 입력해주세요");
		
		int n = kb.nextInt();
		int [] data = new int[n];
		
		
		
		System.out.println(n+"개만큼 정수 입력해주세요");
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
