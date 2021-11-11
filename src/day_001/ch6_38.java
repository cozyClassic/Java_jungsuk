
public class ch6_38 {

	public static void main(String[] args) {
		

	}
	
	class InitTest{
		int x;      	// 인스턴스 변수
		int y = x;		// 인스턴스 변수
		
		void method1() {
			int i;		// 지역 변수
			int j =i;	// 에러. 지역 변수를 초기화 하지 않고 사용.
		}
	}

}
