/*n개의 정수를 입력받아 순서대로 배열에 저장한다. 그런다음 모든 정수들을 한칸 씩 오른쪽으로 shift하라. 마지막 정수는 배열의 첫 칸으로 이동하라.*/

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
		
		System.out.println("정렬 전");

		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}


		int tmp = data[n-1];
		for(int i=n-2;i>=0;i--) {
			data[i+1] = data[i];
		}
		data[0] = tmp;

		System.out.println("정렬 후");
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);	
		}
	}

}
