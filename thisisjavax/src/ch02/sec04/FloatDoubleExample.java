package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//정밀도 확인;
		float var1 = 0.12345678901234557890f;
		double var2 = 0.12345678901234557890;
		System.out.println("varl: " + var1); //7자리
		System.out.println("var2: " + var2);	//15자리
		
		//10의 거듭제곱 리터럴
		double var3 = 3e6;	//3의 6승
		float var4 = 3e6F;	//3의 6승
		double var5 = 2e-3;	//2의 -3승
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		

	}

}
