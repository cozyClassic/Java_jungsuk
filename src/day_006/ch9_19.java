package day_005;

public class ch9_19 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("ABCDEFG");
        System.out.println(sb);

        //SBappend.test();
        //SBinsert.test();
        //SBdelete.test();
        //SBreplace.test();
        System.out.println(sb.reverse()); // GFEDCBA

        System.out.println(sb);           // GFEDCBA
    }
}

class SBappend {
    public static void test() {
        StringBuffer sb = new StringBuffer("abc");

        System.out.println(sb.append("def")); // abcdef
        // append후 넣은 결과를 반환한다.

        System.out.println(sb);               // abcdef
        // '=' 없이도 변경이 정상적으로 반영된다.
    }
}

class SBinsert {
    public static void test() {
        StringBuffer sb = new StringBuffer("abc");

        System.out.println(sb.insert(1, "def")); // adefbc
        // insert후 결과를 반환한다.

        System.out.println(sb); // adefbc
        /// '=' 없이도 변경이 정상적으로 반영된다.
    }
}

class SBdelete {
    public static void test() {
        StringBuffer sb = new StringBuffer("abc");

        System.out.println(sb.delete(1,2)); // ac
        // 삭제 후의 결과 StringBuffer를 반환한다.

        System.out.println(sb); // ac
        // '=' 없이도 변경이 정상적으로 반영된다.

        StringBuffer sb2 = new StringBuffer("abcdefg");

        System.out.println(sb2.delete(1,20)); // a
        // end가 길이를 벗어나도 에러가 발생하지는 않는다.

        sb2 = new StringBuffer("abcdefg");

        //System.out.println(sb.delete(20,30)); // 에러 발생
        // 시작점이 범위를 벗어나면 에러가 발생한다.

        System.out.println(sb2.delete(01,3)); // 에러 발생
        // 01은 괜찮음

        sb2 = new StringBuffer("abcdefg");
        // System.out.println(sb2.delete(-1,3)); // 에러 발생
        // -1은 안됨. (인덱스 에러)

        sb2 = new StringBuffer("abcdefg");
        //System.out.println(sb2.delete(3,1)); // 에러 발생
        // 범위가 역방향이면 안됨.

    }
}

class SBreplace {
    public static void test() {
        StringBuffer sb = new StringBuffer("abc");

        System.out.println(sb.replace(1,2,"HI!")); // aHI!c
        // 변경한 결과를 바로 반환한다.

        System.out.println(sb);                    // aHI!c
        // '=' 없이도 자동으로 반영된다.

        sb = new StringBuffer("abcdef");
        StringBuffer sb2= sb.replace(2,3,"123");
        System.out.println(sb); // ab123def
        System.out.println(sb2);// ab123def
        // - 둘다 바뀜. 내가 원한건 원본은 유지하는 것. 어떻게 해야 할까?

        sb = new StringBuffer("abcdef");
        sb2 = new StringBuffer(sb);
        System.out.println(sb2);
        sb2.replace(1,3,"123");
        System.out.println(sb);     // abcdef
        System.out.println(sb2);    // a123def
        // - 의도했던 대로 분리됨. 객체를 먼저 분리해야 한다.

    }
}