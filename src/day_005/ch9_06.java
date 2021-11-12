package day_005;

public class ch9_06 {
    public static void main(String args[]) {
        String str1 = "abc"; // 문자열 리터럴 "abc"의 주소가 str1에 저장됨.
        String str2 = "abc"; // 문자열 리터럴 "abc"의 주소가 str2에 저장됨

        System.out.println(str1 == str2);       // true
        System.out.println(str1.equals(str2));  // true


        String str3 = new String("abc"); // 새로운 String 인스턴스를 생성
        String str4 = new String("abc"); // 새로운 String 인스턴스를 생성

        System.out.println(str3 == str4);       // false
        System.out.println(str3.equals(str4));  // true

        System.out.println(str1 == str3);       // false
        System.out.println(str1.equals(str3));  // true
    }
}