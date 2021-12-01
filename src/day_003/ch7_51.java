package day_003;
// main 함수가 무조건 맨 위에 있어야 한다?
public class ch7_51 {
    public static void main(String args[]) {

    }

    Object iv = new Object() {
        void method() {
        }
    };

    // 익명 클래스
    static Object cv = new Object() {
        void metohd() {
        }
    };    // 익명 클래스

    void myMethod() {
        Object lv = new Object() {
            void method() {
            }
        };        // 익명 ㅋ르래스
    }

}