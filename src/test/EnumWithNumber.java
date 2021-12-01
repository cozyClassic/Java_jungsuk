package test;

public class EnumWithNumber {
	public static void main(String[] args){
		System.out.println(AlphabetWithCode.findByNumber(2));
		// B
		// 이게 바로 내가 찾던 거였다!!!!
	}
}

enum AlphabetWithCode{
	A(1), B(2), C(3);

	private int num;

	AlphabetWithCode(int num){
		this.num = num;
	}

	static AlphabetWithCode findByNumber(int num){
		for (AlphabetWithCode alphabet : AlphabetWithCode.values()){
			if(alphabet.num == num){ // 여기에서 num으로 접근하지 못하게 하는 방법은?
				return alphabet;
			}
		}
		throw new IllegalArgumentException("올바른 숫자가 없습니다.");
	}
}