package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			
			if(data.equals("q")) {
				break;		// 입력된 문자열이 q라면 반복을 중지.
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
		
	}

}
