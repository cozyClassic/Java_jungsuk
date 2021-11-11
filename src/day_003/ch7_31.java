package day_002;
// Car, FireEngine의 class 세팅
// main 함수가 무조건 맨 위에 있어야 한다?
public class ch7_31 {
    public static void main(String args[]){

    }

}

abstract class Player { // 추상클래스
    abstract void play(int pos); // 추상메서드
    abstract void stop();        // 추상메서드
}

class AudoiPlayer extends Player {
    void play(ins pos) {};  // 추상 메서드 구현 -> 몸통 만들어주기.
    void stop() {};         // 추상 메서드 구현
}

class AbsctractPlayer extends Player { // -> 에러가 발생한다.
    // 에러가 발생하는 이유 : 추상메서드가 2개가 남아있는데 하나만 구현했음.
    // 에러를 해결하는 방법
    // 1. 남은 추상메서드를 구현한다.
    // 2. 클래스에 abstarct를 붙인다.
    void play(ins pos) {}; // 추상메서드 구현
}