package day_002;

public class ch7_23 {
    public static void main(String args[]) {

    }

    Class Tv {
        boolean power;
        int channel;

        void power() {
            power = !power;
        }

        void channelUp(){
            ++ channel;
        }

        void channelDown(){
            -- channel;
        }
    }

    class SmartTv extends Tv {
        String text;
        void caption(){}
    }
}
