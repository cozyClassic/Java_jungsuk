package day_008;

public class ch12_19 {
    public static void main(String[] args) {
        class CardEnum {
            enum Kind { Clover, Heart, Diamond, Spade}
            Kind kind;
        }

        System.out.println(CardEnum.Kind.Heart); // Heart
        System.out.println(CardEnum.Kind.Heart.name()); // Heart
        System.out.println(CardEnum.Kind.Heart.ordinal()); // 1
        System.out.println(CardEnum.Kind.Heart.getDeclaringClass());
        // class day_008.CardEnum$Kind

        System.out.println(CardEnum.Kind.valueOf("Diamond")); // Diamond
        //System.out.println(CardEnum.Kind.valueOf(Heart)); // 에러

        System.out.println(CardEnum.Kind.Heart.compareTo(CardEnum.Kind.Diamond));
        // -1
        // System.out.println(CardEnum.Kind.Heart < CardEnum.Kind.Diamond); // 에러
        //  error: bad operand types for binary operator '<'
    }
}


