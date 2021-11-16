package day_008;

import java.util.Arrays;

public class ch12_20 {
    public static void main (String args[]){
        System.out.println(Arrays.toString(testEnum.Direction.values())); // [EAST, SOUTH, WEST, NORTH]
        System.out.println(testEnum.Direction.SOUTH.getValue()); // 외부에서 값 호출하기.

    }
}

class testEnum {
    enum Direction {
        EAST(1), SOUTH(5), WEST(-1), NORTH(10); // 끝에 ';'를 붙인다.

        private final int value; // 정수를 저장할 필드 추가
        Direction(int value) {this.value = value;} // 생성자 추가

        public int getValue() {return value;}
    }
}