/*사용자로부터  n개의 정수를 입력받는다. 이어서 N개의 정수를 입력받아 순서대로 배열에 저장한다. 
  그런 다음 중복된 정수 쌍의 개수를 카운트하여 출력하라. 예를 들어 n=6이고 입력된 정수들이 2,4,2,4,5,2 
  중복된 정수쌍은 (2,2),(2,2),(2,2),(4,4)로 모두 4쌍이다.*/

package Section01;

import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);    //Scanner 인스턴스화
		int n = kb.nextInt(); // 사용자로부터 n의 정수를 입력받음
		int [] data= new int[n];  // n개만큼의 배열을 담을 수 있는 배열을 입력받는다.
		
		for(int i=0;i<n;i++) // 사용자로부터 n개의 정수를 입력받는다.
			data[i] = kb.nextInt();
		
		int count = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(data[i]==data[j])
					count++;
			}
		}
		
		System.out.println("중복된 정수쌍은 총 "+count+"쌍입니다.");
		

	}

}
