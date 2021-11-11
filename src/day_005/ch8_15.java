package day_005;

public class ch8_15 {
    public static void main(String args[]) {
        try {
            method1();              //1. 에러 발생
        } catch (Exception e) {     //4. 3에서 발생한 예외 처리
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
        }

    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) { // 2. 예외 처리
            System.out.println("method1 메서드에서 예외가 처리되었습니다.");
            throw e;            // 3. 다시 예외를 발생시킨다.
        }
    }
}
