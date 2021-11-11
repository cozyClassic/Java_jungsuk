package day_005;

public class ch9_05 {
    public static void main(String args[]) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        //day_005.Card@4fcd19b3
        //day_005.Card@376b4233
    }
}

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
}