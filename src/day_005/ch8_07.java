package day_005;

public class ch8_07 {
    public static void main(String args[]) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0); // 예외 발생
            System.out.println(4);   // 실행 안됨
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("예외 메시지 : " + ae.getMessage());
        }

        System.out.println(6);
    }
}

/* 결과
1
2
3
java.lang.ArithmeticException: / by zero
        at day_005.ch8_07.main(ch8_07.java:10)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:567)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:415)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:192)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:132)
예외 메시지 : / by zero
6
 */