package day_009;

public class ch14_5 {
    public static void main (String[] args){
        aMethod(()-> System.out.println("myMethod()"));

    }

    static void aMethod(MyFunction f) {
        f.myMethod();
    }

    /*
    //MyFunction f = () -> System.out.println("myMethod()");
    aMethod(); // 에러 발생
    //Missing method body, or declare abstract
    /*
     */
}

@FunctionalInterface
interface MyFunction {
    void myMethod(); // 추상메소드
}