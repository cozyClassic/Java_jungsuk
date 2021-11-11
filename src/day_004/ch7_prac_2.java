package day_002;

public class ch7_prac_2 {
    public static void main(String args[]) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH : " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL : " + t.getVolume());
        t.setChannel(20);
        System.out.println("CH : " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH : " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH : " + t.getChannel());
    }
}

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    int prevChannel;

    final int MAX_VOLUME  = 100;
    final int MIN_VOLUME  = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 0;

    void setChannel(int channel) {
        this.prevChannel = this.channel;
        this.channel = channel;
    }

    void setVolume(int volume){
        this.volume = volume;
    }

    int getChannel() {
        return this.channel;
    }

    int getVolume() {
        return this.volume;
    }

    void gotoPrevChannel() {
        int temp         = this.channel;
        this.channel     = this.prevChannel;
        this.prevChannel = temp;
    }
}