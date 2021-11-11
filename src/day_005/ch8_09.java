package day_005;

public class ch8_09 {
    public static void main(String args[]) {
        //throw new Exception();
        /* 결과
        에러메시지 : 에러를 throw 한 뒤에는 catch나 declare해줘야 한다.
        ch8_09.java:5: error: unreported exception Exception; must be caught or declared to be thrown
                throw new Exception();

        */
        throw new RuntimeException();
        /*결과
        Exception in thread "main" java.lang.RuntimeException
        at day_005.ch8_09.main(ch8_09.java:12)

         */
    }
}

