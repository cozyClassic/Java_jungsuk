package day_008;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ch12_17 {
    public static void main(String[] args){
        System.out.println(CardOrigin.Clover == CardOrigin.TWO); // true
        // 원래는 두개가 동일하면 안되는데 true가 되버림

        System.out.println(CardEnum.Value.TWO); // TWO
        System.out.println(CardEnum.Kind.Clover); // Clover
        //System.out.println(CardEnum.Kind.Clover == CardEnum.Value.TWO ); // 에러발생
        // incomparable types: Kind and Value - 타입이 달라 비교할 수 없다.

        // enum에 있는 값들 전체를 불러오기.
        System.out.println(Arrays.toString(CardEnum.Kind.values()));


    }
}

class CardOrigin {
    static final int Clover = 0;
    static final int Heart  = 1;
    static final int Diamon = 2;
    static final int Spade  = 3;

    static final int TWO    = 0;
    static final int THREE  = 1;


    final int kind = 0;
    final int num = 0;
}

class CardEnum {
    enum Kind { Clover, Heart, Diamond, Spade} // ; 없음.
    enum Value { TWO, THREE, FOUR} // ; 없음
    // Clover =0, Heart =1, Diamond = 2.. 가 자동으로 할당된다. (순서대로)
    // Two = 0, THREE = 1, FOUR = 3.. 가 자동으로 할당된다. (순서대로)

    Kind kind; // 타입이 int가 아닌 Kind임에 유의하라.
    Value value;
}

