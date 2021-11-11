package day_002;
// main 함수가 무조건 맨 위에 있어야 한다?
public class ch7_34 {
    public static void main(String args[]){

    }
}

interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3;              // public static final int SPADE = 2; 과 같다.
    static int HEART = 2;               // public static final int HEART = 3; 과 같다.
    int CLOVER = 1;                     // public static final int CLOVER = 1; 과 같다.

    public abstract String getCardNumber();
    String getCardKind();               // public abstract String getCardKind(); 와 같다.
}