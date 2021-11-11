package day_002;

public class ch7_prac_3 {
    public static void main(String args[]) {
        Outer objOut = new Outer();
        Outer.Inner objIn = objOut.new Inner();     // static이 아니면 인스턴스로 만들어야 꺼내 쓸 수 있다.
        System.out.println(objIn.iv);


        Outer2.Inner2 objin2 = new Outer2.Inner2(); // static으로 선언된 클래스는 인스턴스로 안만들어도 꺼내쓸 수 있다.
        System.out.println(objin2.iv);
    }
}

class Outer {
    class Inner {
        int iv = 100;
    }
}

class Outer2 {
    static class Inner2 {
        int iv = 200;
    }
}