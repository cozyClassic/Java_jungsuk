package test;

public class InstanceOf {
	public static void main(String[] args){
		StrInstanceOf.test();
	}
}

class StrInstanceOf {
	static void test(){
		String str = "abc";

		boolean TrueOrFalse;

		// intstanceof는 "연산자"이다.
		// 객체명 + blank +  instanceof + blank + 클래스명

		TrueOrFalse = new String() instanceof String;
		System.out.println(TrueOrFalse);

		TrueOrFalse = str instanceof String;
		System.out.println(TrueOrFalse);

		TrueOrFalse = "123" instanceof String;
		System.out.println(TrueOrFalse);

		// TrueOrFalse = 123 instanceof String;
		// 에러발생 : 123은 객체가 아니라 기본데이터타입이라 작동안됨. Object여야 하는듯.



	}
}