package day_002;

public class ch7_prac_4 {
    public static void main(String args[]) {
        Outer objOut = new Outer();
        Outer.Inner objIn = objOut.new Inner();
        objIn.method1();

    }
}

class Outer {
    int value = 10;

    class Inner {
        int value = 20;
        void method1() {
            int value = 30;

            System.out.println(value);           // 지역변수
            System.out.println(this.value);      // 인스턴스 변수
            System.out.println(Outer.this.value);//내부클래스에서 외부클래스의 변수에 접근 시에는, 외부클래스명.this.변수명으로 접근할 수 있다.
        }
    }
}