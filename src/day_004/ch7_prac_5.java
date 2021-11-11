package day_002;

import java.awt.*;
import java.awt.event.*;

public class ch7_prac_5 {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowsClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}
/* 익명함수로 만들기
class Eventhandler extends WindowAdapter {
    public void windowsClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}
*/