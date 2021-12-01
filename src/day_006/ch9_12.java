package day_006;

import java.util.StringJoiner;  // import 해줘야 쓸 수 있다.

public class ch9_12 {
    public static void main(String args[]) {
        StringJoiner sj = new StringJoiner("," , "[" , "]");
        String[] strArr = { "aaa", "bbb", "ccc", "ddd" };

        for (String s : strArr){
            sj.add(s.toUpperCase());
        }
        System.out.println(sj.toString());  //[AAA,BBB,CCC,DDD]
    }
}