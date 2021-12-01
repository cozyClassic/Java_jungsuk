package test;

// 1. 인터페이스 및 공용 메소드를 선언한다. (뼈대 만들기)
interface Callable {
    public void call(int param);
}

// 2. 상인터페이스를 상속받는 클래스 + 메소드 완성하기
class CallClass implements Callable {
    public void call(int param){
        System.out.println(param);
    }
}

public class FuncAsArgument {
    // 3-1. 자신의 인자로 1) 인터페이스의 인스턴스 2)메소드의 인자
    // 를 받는 메소드 선언
    public static void invoke(Callable callable, int param){
        // 3-2. 메소드는 인터페이스의 함수를 실행시킨다.
        callable.call(param);
    }

    public static void main (String[] args){
        // 4-1. 상속 클래스의 인스턴스를 생성한다.
        // 리모콘(참조변수)는 인터페이스이다.
        Callable cmd = new CallClass();

        // 4-2. 인스턴스, 인자를 데이터로 넣어서 완성한다.
        invoke(cmd, 10);
    }
}
