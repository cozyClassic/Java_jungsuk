package day_002;
// Car, FireEngine의 class 세팅
// main 함수가 무조건 맨 위에 있어야 한다?
public class ch7_33 {
    public static void main(String args[]){

    }
}


class Player {
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer extends Player {
    void play (int pos){
      System.out.println(pos + "번째 플레이입니다.");
    }

    void stop (){
        System.out.println("플레이 중지");
    }
}

class AbstractPlayer{
    void play(int pos){
        System.out.println(pos + "번째 플레이입니다.");
    }
    abstract void stop();
}