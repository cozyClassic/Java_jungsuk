package test;

public class whyUseEnum {
}

class case1 {
    /*
    1. 사과
    2. 복숭아
    3. 바나나
    */
    static void test(){
        int type = 1;
        switch(type){
            case 1 :
                System.out.println(57);
                break;
            case 2 :
                System.out.println(34);
                break;
            case 3 :
                System.out.println(93);
                break;
        }
    }
}

/* 문제점
1. case를 각각 봐도, 이게 어떤 경우인지 알려면 위의 주석을 찾아봐야 함.
  (많아지면 보기 힘들다.)
2. 주석이라 사람들이 실수로 지울 가능성이 있음.
 */

class case2 {
    private final static int APPLE = 1;
    private final static int PEACH = 2;
    private final static int BANANA = 3;
    static void test() {
        int type = APPLE; // 타입 선언
        switch(type){
            case APPLE :
                System.out.println(57 +" kcal");
                break;
            case PEACH :
                System.out.println(34 +" kcal");
                break;
            case BANANA :
                System.out.println(93 +" kcal");
                break;
        }
    }
}

/* 문제점
과일 APPLE이 아니라, 회사 APPLE을 선언하고 싶을 때는 어떻게 할까?
→ 원래 이름대로는 선언할 수 없음
해결방법 ->  COMPANY_APPLE, FRUIT_APPLE 이런식으로 분리해야 한다.
*/



class case3 {
    interface FRUIT { int APPLE = 1, PEACH = 2, BANANA = 3;}
    interface COMPANY { int GOOGLE = 1, APPLE = 2, ORACLE = 3;}
    static void test(){
        int type = FRUIT.APPLE; // 타입 선언
        switch(type){
            case FRUIT.APPLE :
                System.out.println(57 +" kcal");
                break;
            case FRUIT.PEACH :
                System.out.println(34 +" kcal");
                break;
            case FRUIT.BANANA :
                System.out.println(93 +" kcal");
                break;
        }

        // 문제의 코드
        if(FRUIT.APPLE == COMPANY.APPLE) {
            System.out.println("과일애플과 기업애플은 같습니다");
        }
        // 애초에 비교 조차 할수 없어야 하는데 비교가 가능해진다.
    }
}

// 애초에 비교 할 수 없게 만들기 : 인터페이스 대신 클래스 및 객체 사용하기

class case4 {
    class Fruit{
        public final Fruit APPLE = new Fruit();
        public final Fruit PEACH = new Fruit();
        public final Fruit BANANA = new Fruit();
    }
    class Company{
        public final Company GOOGLE = new Company();
        public final Company APPLE = new Company();
        public final Company ORACLE = new Company();
    }
    static void test() {
        /*if(Fruit.APPLE == Company.APPLE) { // 에러발생
            System.out.println("과일애플과 기업애플이 같다.");
        }*/
    }
}
/* 또 다른 문제점.
 switch/ case 문을 사용할 수 없다.
 switch의 인자로는 몇가지 제한된 데이터 타입만 사용할 수 있다.
 byte, short, char, int, enum, String,
 Character, Byte, Short, Integer
 여기에 "enum"이 있음에 주목하자.
 */

class case5 {
    enum Fruit{ APPLE, PEACH, BANANA}
    enum Company{GOOGLE, ORACLE, APPLE}

    static void test() {
        Fruit type = Fruit.APPLE; // 타입 선언
        switch(type){
            case APPLE :
                System.out.println(57 +" kcal");
                break;
            case PEACH :
                System.out.println(34 +" kcal");
                break;
            case BANANA :
                System.out.println(93 +" kcal");
                break;
        }
    }
}