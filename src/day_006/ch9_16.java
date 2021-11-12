package day_005;

public class ch9_16 {
    public static void main(String args[]) {
        public StringBuffer(int length) {
            value = new char[length];
            shared = false;
        }

        public stringBuffer() {
            this(16);               //버퍼의 크기를 지정하지 않으면 버퍼의 크기는 16이 된다.
        }

        public StringBuffer(String str) {
            this(str.length() + 16);// 지정한 문자열의 길이보다 16이 더 크게 버퍼를 생성한다.
            append(str);
        }

    }
}