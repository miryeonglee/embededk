package javabasic;

public class Variable1 {
	public static void main(String[] args) {
		//	자바 기본타입 8가지
		// 기본타입 : 정수나 실수 의 값을 기본 평가하는 타입
		//	100이라는 정수 	- int
		//	3,14라는 실수 	- double = 값에도 타입이 있다.
		byte b = 1;			// 1바이트 정수 -2^7 ~ 2^7-1
		short s = 2;		// 2 바이트 정수 -2^15 ~ 2^15-1
		int i = 4;			// 4 바이트 정수 -2^31 ~ 2^31-1, 정수의 기본타입
		long l = 8;			// 8 바이트 정수 -2^63 ~ 2^63-1
		float f = 3.14f;	// 4 바이트 실수, 3.14는 double이므로 3.14f 라고써서 4바이트 3.14임을 알림
		double d = 2.1;	// 8 바이트 실수, 실수의 기본 타입
		char c = 'A';		// 1바이트, 유니코드 문자
		boolean bool = true; // 1바이트 , true or false
	}
}
