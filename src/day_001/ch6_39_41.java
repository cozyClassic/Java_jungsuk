
public class ch6_39_41 {
	
	static {
		System.out.println("static {} - 클래스 초기화 블럭 ");
	}
	
	{
		System.out.println("{} - 인스턴스 초기화 블럭 ");
	}

	public static void main(String[] args) {
		System.out.println("인스턴스 생성 ");
		ch6_39_41 instance1 = new ch6_39_41();
		
		System.out.println("인스턴스 생성2 ");
		ch6_39_41 instance2 = new ch6_39_41();
		
		ch6_41 C = new ch6_41();
		
		int[] arr = C.arr;
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}

}

class ch6_41 {
	static int[] arr = new int[10];
	
	static {
		for (int i=0; i<arr.length; i++) {
			// 1과 10 사이의 랜덤한 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}
}
