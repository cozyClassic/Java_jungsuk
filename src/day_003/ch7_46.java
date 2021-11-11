package day_002;
// main 함수가 무조건 맨 위에 있어야 한다?
public class ch7_46 {
    public static void main(String args[]) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        System.out.println(InstanceInner.cv);
    }
    class InstanceInner {
        int iv = 100;
        static int cv = 100; // 책에는 안된다고 나와있는데 되고 있음.!!
        final static int CONST = 100;
    }
    static class StaticInner {
        int iv = 200;
        static int cv = 200;  // static 클래스만 static멤버를 정의할 수 있다.
    }

    void myMethod() {
        class LocalInner {
            static int cv = 300;  // 에러! static변수를 선언할 수 없다.
            final static int CONST = 300; // final static은 완전히 상수이므로 허용.
        }
    }
}
