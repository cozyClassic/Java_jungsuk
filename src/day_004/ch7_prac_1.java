package day_002;

public class ch7_prac_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        for (int i=0; i < deck.cards.length; i++){
            System.out.print(deck.cards[i] + ",");
        }

        deck.shuffle();
        System.out.println("");

        for (int i=0; i < deck.cards.length; i++){
            System.out.print(deck.cards[i] + ",");
        }

        System.out.println("");
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());

    }
}

// main 함수가 무조건 맨 위에 있어야 한다?
/*
섯다카드 20장을 포함하는 섯다카드 한벌을 정의했다.
섯다카드 20장을 담는 SutdaCard 배열을 초기화 하시오.
단, 섯다 카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
숫자가 1,3,8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다.
즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야 한다.
 */

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i=0; i<CARD_NUM; i++){
            boolean isKwang = (i==0 || i==2 || i==7);
            cards[i] = new SutdaCard((i%10)+1,isKwang);
        }
    }

    void shuffle() {
        int prev = 0;
        SutdaCard temp;
        for (int i=0; i<20; i++) {
            int rand = (int) Math.round(Math.random()*19);
            temp = cards[prev];
            cards[prev] = cards[rand];
            cards[rand] = temp;
            prev = rand;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        int index = (int) Math.round(Math.random()*19);
        return cards[index];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() { // 생성자
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num        = num;
        this.isKwang    = isKwang;
    }

    // info() 대신 Object클래스의 toString()을 오버라이딩 했다.

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}



//결과 : 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,