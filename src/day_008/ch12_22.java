package day_008;

public class ch12_22 {
    public static void main (String args[]){

    }
}

enum Direction2 { // 그러나 이렇게 enum을 선언하는 것이 dictonary를 만들어두는 것과 대체 뭐가 다를까?
    EAST(1, ">"), SOUTH(2,"V"), WEST(3, "<"), NORTH(4, "^");
    // 1. 생성자를 호출함.

    // 4. 열거형에 값들을 담아놓기.
    private static final Direction2[] DIR_ARR = Direction2.values();

    // 3. 생성자에 필요한 참조변수를 선언
    private final int    value;
    private final String symbol;

    // 2. 생성자를 만듬.
    Direction2(int value, String symbol){
        this.value  = value;
        this.symbol = symbol;
    }

    // 기타. 필요한 메소드 만들기
    public int     getValue()  { return value; }
    // oridnal를 쓰지 말고 이렇게 상수를 반환하는 메소드를 만들어야 한다.
    public String  getSymbol() { return symbol; }

    public static Direction2 of(int dir) { // of 는 뭐지? - enum에서 메소드를 선언하는 방법.
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return DIR_ARR[dir -1];
    }
}

/**
 * hi
 * hello
 */