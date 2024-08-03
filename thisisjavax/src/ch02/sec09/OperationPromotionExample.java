package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte resultt1 = 10 + 20;	//컴파일 단계에서 연산;
		System.out.println(resultt1);
		
		byte v1 = 10;
		byte v2 = 20;
		int resultt2 = v1 + v2;	//인트타입으로 변화노 휘;
		System.out.println(resultt2);
		
		byte v3 = 10;
		int v4 = 100; //long 타입으로 변호나 후 연산;
		long v5 = 1000L;
		long resultt3 = v3 + v4 + v5;
		System.out.println(resultt3);
		
		char v6 = 'A';
		char v7 = 1;
		int resultt4 = v6 + v7;	//int 타입으로 변환 후 연산
		System.out.println("resultt4: " + resultt4);
		System.out.println("resultt4: " + (char)resultt4);
		
		int v8 = 10;
		int resultt5 = v8 / 4;	//정수 연산의 결과는 정수;
		System.out.println("resultt5: " + resultt5);
		
		int v9 = 10;
		double resultt6 = v9 / 4.0;
		System.out.println("resultt6: " + resultt6);
		
		int v10 = 1;
		int v11 = 2;
		double resultt7 = (double) v10 / v11;
		System.out.println("resultt7: " +resultt7);
				
		
		

	}

}
