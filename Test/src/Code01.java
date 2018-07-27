

public class Code01 {
	
	
	
	public static int num;// 함수외부에 선언가능, 외부에 선언된 변수는 그 클래스 전체에서 아용이 가능하다
	
	

	public static void main(String[] args) {
		
		int anotherNum = 5; //내부 선언도가능
		num = 2;
		
		System.out.println(num + anotherNum);
		System.out.println("Num: "+ num);
		System.out.println("AnotherNum:" +anotherNum);
		System.out.println("sum:" + (num + anotherNum));//left associativity
		// TODO Auto-generated method stub

	}

}
