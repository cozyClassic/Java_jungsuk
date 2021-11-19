package test;

import java.util.Arrays;

public class EnumTutorial {
    public static void main(String[] args){
        //declareAndAssignment.test();
        //innerVar.test();
        //enumInnerMethod.test();
        enumValueMethods.test();
    }
}



class declareAndAssignment{
    enum Fruit{
        APPLE, PEACH, BANANA;
        Fruit(){
            System.out.println(this + "가 생성되었습니다.");
        }
    }

    static void test(){
        System.out.println("메인 메소드가 실행되었습니다.");
        Fruit type;
        System.out.println("참조변수가 선언되었습니다.");
        type = Fruit.APPLE;
        System.out.println("할당되었습니다.");
/* 결과
메인 메소드가 실행되었습니다.
참조변수가 선언되었습니다.
APPLE가 생성되었습니다.
PEACH가 생성되었습니다.
BANANA가 생성되었습니다.
할당되었습니다
*/
    }
}


class innerVar{
    enum Fruit{
        APPLE("red"), PEACH("pink"), BANANA("yellow");
        // 생성자 내에 인자를 넣는 순간, 기존의 변수?들
        // APPLE, PEACH, BANANA는 인자가 필요해진다.
        String color;
        Fruit(String color){
            System.out.println(this + "가 생성되었습니다.");
            this.color = color;
        }
    }

    static void test(){
        Fruit type = Fruit.APPLE;
        System.out.println("할당되었습니다.");
        System.out.println(type.color);
    }
}


class enumInnerMethod{
    enum Fruit{
        APPLE("red"), PEACH("pink"), BANANA("yellow");
        // 생성자 내에 인자를 넣는 순간, 기존의 변수?들
        // APPLE, PEACH, BANANA는 인자가 필요해진다.
        private String color;
        String getColor(){
            return this.color;
        }
        Fruit(String color){
            System.out.println(this + "가 생성되었습니다.");
            this.color = color;
        }
    }

    static void test(){
        Fruit type = Fruit.APPLE;
        System.out.println("할당되었습니다.");
        System.out.println(type.getColor());
        System.out.println(type.color);
    }
}

class enumValueMethods {
    enum Fruit{
        APPLE("red"), PEACH("pink"), BANANA("yellow");
        // 생성자 내에 인자를 넣는 순간, 기존의 변수?들
        // APPLE, PEACH, BANANA는 인자가 필요해진다.
        private String color;
        String getColor(){
            return this.color;
        }
        Fruit(String color){
            this.color = color;
        }
    }

    static void test(){
        for (Fruit f : Fruit.values()){
            System.out.println(f);
        }
        /*
        APPLE
        PEACH
        BANANA
         */
        Fruit type = Fruit.APPLE;
        System.out.println(type);
        // APPLE
        System.out.println(type.color + "," + type.getColor());
        // red,red
        System.out.println(Fruit.values());
        // [Ltest.enumValueMethods$Fruit;@56a6d5a6
        System.out.println(Arrays.toString(Fruit.values()));
        // [APPLE, PEACH, BANANA]
        System.out.println(Fruit.valueOf("APPLE"));
        //APPLE
        System.out.println(Fruit.valueOf("APPLE").getColor());
        //red
    }
}