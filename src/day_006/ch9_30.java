package day_005;

public class ch9_30 {
    public static void main(String args[]) {
        int i = 5;
        Integer iObj = 7;
        // new Integer(7); 선언 시 에러 발생.

        int sum = i + iObj; // JDK 1.5 이전에는 기본형과 참조형간의 덧셈이 불가능했다.
        System.out.println(sum); // 12

        System.out.println(i + iObj.intValue());
    }
}