package day_002;
// main 함수가 무조건 맨 위에 있어야 한다?
public class ch7_48 {
    public static void main(String args[]) {

    }
}

class Outer {
    private int outerIv = 0;
    static  int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv; // 외부 클래스의 private멤버도 접근 가능하다.
        int iiv2= outerCv;
    }

    static class StaticInner {
        static int scv = outerCv;
        //int siv = outerIv; // 에러발생. 스태틱 클래스는, 외부 클래스의 인스턴스 멤버(변수)에 접근할 수 없다.
        // non-static variable outerIv cannot be referenced from a static context
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0; // JDK1.8부터 fianl 생략 가능.

        class LocalInner {
            int liv = outerIv;
            int iiv2= outerCv;

            // JDK1.8부터 에러 아님.
            // 옛날에는 외부 클래스의 지역변수에는 final이 붙은 변수(상수)에만 접근 가능했다.
            int liv3= lv;
            int liv4= LV;
        }
    }
}