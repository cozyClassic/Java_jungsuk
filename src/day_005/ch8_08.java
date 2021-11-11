package day_005;

public class ch8_08 {
    public static void main(String args[]) {
        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e; // 예외 발생시킴
            // trhow new Exception("고의로 발생시켰음."); // 위의 두줄을 한줄로 줄일 수 있다.
        } catch (Exception e){
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상종료.");
    }
}

/* 결과
에러 메시지 : 고의로 발생시켰음.
java.lang.Exception: 고의로 발생시켰음.
        at day_005.ch8_08.main(ch8_08.java:6)
프로그램 정상종료.
 */