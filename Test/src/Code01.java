

public class Code01 {
	
	
	
	public static int num;// �Լ��ܺο� ���𰡴�, �ܺο� ����� ������ �� Ŭ���� ��ü���� �ƿ��� �����ϴ�
	
	

	public static void main(String[] args) {
		
		int anotherNum = 5; //���� ���𵵰���
		num = 2;
		
		System.out.println(num + anotherNum);
		System.out.println("Num: "+ num);
		System.out.println("AnotherNum:" +anotherNum);
		System.out.println("sum:" + (num + anotherNum));//left associativity
		// TODO Auto-generated method stub

	}

}
